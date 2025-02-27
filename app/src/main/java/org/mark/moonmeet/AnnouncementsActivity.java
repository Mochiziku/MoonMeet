package org.mark.moonmeet;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;

import org.mark.moonmeet.ui.BaseFragment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;

public class AnnouncementsActivity extends BaseFragment {

    private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();

    private FloatingActionButton _fab;
    private double time = 0;

    private ArrayList<HashMap<String, Object>> Users_LM = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> Announcement_LM = new ArrayList<>();

    private LinearLayout topbar;
    private LinearLayout Divider;
    private LinearLayout holder;
    private ImageView back;
    private TextView announcements_text;
    private LinearLayout space_top;
    private LinearLayout noannyet;
    private RecyclerView RecyclerView;
    private MaterialTextView noannyet_full_txt;
    private MaterialTextView noannyet_mini_txt;

    private Intent toContinue = new Intent();
    private DatabaseReference users = _firebase.getReference("users");
    private ChildEventListener _users_child_listener;
    private FirebaseAuth Fauth;
    private OnCompleteListener<Void> Fauth_updateEmailListener;
    private OnCompleteListener<Void> Fauth_updatePasswordListener;
    private OnCompleteListener<Void> Fauth_emailVerificationSentListener;
    private OnCompleteListener<Void> Fauth_deleteUserListener;
    private OnCompleteListener<Void> Fauth_updateProfileListener;
    private OnCompleteListener<AuthResult> Fauth_phoneAuthListener;
    private OnCompleteListener<AuthResult> Fauth_googleSignInListener;
    private OnCompleteListener<AuthResult> _Fauth_create_user_listener;
    private OnCompleteListener<AuthResult> _Fauth_sign_in_listener;
    private OnCompleteListener<Void> _Fauth_reset_password_listener;
    private DatabaseReference announcement = _firebase.getReference("announcement");
    private ChildEventListener _announcement_child_listener;
    private Calendar c = Calendar.getInstance();

    @Override
    public View createView(Context context) {
        fragmentView = new FrameLayout(context);
        actionBar.setAddToContainer(false);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.announcements, ((ViewGroup) fragmentView), false);
        ((ViewGroup) fragmentView).addView(view);
        initialize(context);
        com.google.firebase.FirebaseApp.initializeApp(context);
        initializeLogic();
        return fragmentView;
    }

    private void initialize(Context context) {
        _fab = (FloatingActionButton) findViewById(R.id._fab);

        topbar = (LinearLayout) findViewById(R.id.topbar);
        Divider = (LinearLayout) findViewById(R.id.Divider);
        holder = (LinearLayout) findViewById(R.id.holder);
        back = (ImageView) findViewById(R.id.back);
        announcements_text = (TextView) findViewById(R.id.announcements_text);
        space_top = (LinearLayout) findViewById(R.id.space_top);
        noannyet = (LinearLayout) findViewById(R.id.noannyet);
        RecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        noannyet_full_txt = (MaterialTextView) findViewById(R.id.noannyet_full_txt);
        noannyet_mini_txt = (MaterialTextView) findViewById(R.id.noannyet_mini_txt);
        Fauth = FirebaseAuth.getInstance();

        back.setOnClickListener(_view -> finishFragment());

        _fab.setOnClickListener(_view -> {
            presentFragment(new AnnouncementPostActivity(), false);
        });

        _users_child_listener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot _param1, String _param2) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {
                };
                final String _childKey = _param1.getKey();
                final HashMap<String, Object> _childValue = _param1.getValue(_ind);
                Users_LM.add(_childValue);
            }

            @Override
            public void onChildChanged(DataSnapshot _param1, String _param2) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {
                };
                final String _childKey = _param1.getKey();
                final HashMap<String, Object> _childValue = _param1.getValue(_ind);

            }

            @Override
            public void onChildMoved(DataSnapshot _param1, String _param2) {

            }

            @Override
            public void onChildRemoved(DataSnapshot _param1) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {
                };
                final String _childKey = _param1.getKey();
                final HashMap<String, Object> _childValue = _param1.getValue(_ind);

            }

            @Override
            public void onCancelled(DatabaseError _param1) {
                final int _errorCode = _param1.getCode();
                final String _errorMessage = _param1.getMessage();

            }
        };
        users.addChildEventListener(_users_child_listener);

        _announcement_child_listener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot _param1, String _param2) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {
                };
                final String _childKey = _param1.getKey();
                final HashMap<String, Object> _childValue = _param1.getValue(_ind);
                Announcement_LM.add(_childValue);
                if (Announcement_LM.size() < 1) {
                    noannyet.setVisibility(View.VISIBLE);
                } else {
                    if (Announcement_LM.size() > 0) {
                        noannyet.setVisibility(View.GONE);
                        RecyclerView.setAdapter(new RecyclerViewAdapter(Announcement_LM));
                        RecyclerView.getAdapter().notifyDataSetChanged();
                        Collections.reverse(Announcement_LM);
                    }
                }
            }

            @Override
            public void onChildChanged(DataSnapshot _param1, String _param2) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {
                };
                final String _childKey = _param1.getKey();
                final HashMap<String, Object> _childValue = _param1.getValue(_ind);

            }

            @Override
            public void onChildMoved(DataSnapshot _param1, String _param2) {

            }

            @Override
            public void onChildRemoved(DataSnapshot _param1) {
                GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {
                };
                final String _childKey = _param1.getKey();
                final HashMap<String, Object> _childValue = _param1.getValue(_ind);

            }

            @Override
            public void onCancelled(DatabaseError _param1) {
                final int _errorCode = _param1.getCode();
                final String _errorMessage = _param1.getMessage();

            }
        };
        announcement.addChildEventListener(_announcement_child_listener);

        Fauth_updateEmailListener = _param1 -> {
            final boolean _success = _param1.isSuccessful();
            final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";

        };

        Fauth_updatePasswordListener = _param1 -> {
            final boolean _success = _param1.isSuccessful();
            final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";

        };

        Fauth_emailVerificationSentListener = _param1 -> {
            final boolean _success = _param1.isSuccessful();
            final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";

        };

        Fauth_deleteUserListener = _param1 -> {
            final boolean _success = _param1.isSuccessful();
            final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";

        };

        Fauth_phoneAuthListener = task -> {
            final boolean _success = task.isSuccessful();
            final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";

        };

        Fauth_updateProfileListener = _param1 -> {
            final boolean _success = _param1.isSuccessful();
            final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";

        };

        Fauth_googleSignInListener = task -> {
            final boolean _success = task.isSuccessful();
            final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";

        };

        _Fauth_create_user_listener = _param1 -> {
            final boolean _success = _param1.isSuccessful();
            final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";

        };

        _Fauth_sign_in_listener = _param1 -> {
            final boolean _success = _param1.isSuccessful();
            final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";

        };

        _Fauth_reset_password_listener = _param1 -> {
            final boolean _success = _param1.isSuccessful();

        };
    }

    private void initializeLogic() {
        back.setImageTintList(new android.content.res.ColorStateList(new int[][]{{-android.R.attr.state_pressed}, {android.R.attr.state_pressed}}, new int[]{Color.parseColor("#FF193566"),
                Color.parseColor("#FF193566")}));
        topbar.setElevation((int) 2);
        if (FirebaseAuth.getInstance().getCurrentUser().getUid().equals("d2bZ9GGc15UCMdU7CvHQ6dtwRUI3")) {
            _fab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("#FF193566")));
            _fab.show();
        } else {
            _fab.hide();
        }
        RecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RecyclerView.setHasFixedSize(true);
        androidx.appcompat.widget.TooltipCompat.setTooltipText(back, "Back");
    }

    @Override
    public boolean onBackPressed() {
        finishFragment();
        return false;
    }

    public void _Time(final double _position, final TextView _TextViewVar) {
        c = Calendar.getInstance();
        time = c.getTimeInMillis() - _position;
        if (((time / 1000) / 3600) < 24) {
            c.setTimeInMillis((long) (_position));
            _TextViewVar.setText(new SimpleDateFormat("hh:mm a").format(c.getTime()));
        } else {
            c.setTimeInMillis((long) (_position));
            _TextViewVar.setText(new SimpleDateFormat("MMM d 'at' hh:mm a").format(c.getTime()));
        }
    }


    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
        ArrayList<HashMap<String, Object>> _data;

        public RecyclerViewAdapter(ArrayList<HashMap<String, Object>> _arr) {
            _data = _arr;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater _inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View _v = _inflater.inflate(R.layout.announcementsc, null);
            RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            _v.setLayoutParams(_lp);
            return new ViewHolder(_v);
        }

        @Override
        public void onBindViewHolder(ViewHolder _holder, final int _position) {
            View _view = _holder.itemView;

            final LinearLayout BackGround = (LinearLayout) _view.findViewById(R.id.BackGround);
            final androidx.cardview.widget.CardView CardView = (androidx.cardview.widget.CardView) _view.findViewById(R.id.CardView);
            final LinearLayout LinearInsideCard = (LinearLayout) _view.findViewById(R.id.LinearInsideCard);
            final LinearLayout linear27 = (LinearLayout) _view.findViewById(R.id.linear27);
            final LinearLayout linear24 = (LinearLayout) _view.findViewById(R.id.linear24);
            final TextView textview9 = (TextView) _view.findViewById(R.id.textview9);
            final ImageView image = (ImageView) _view.findViewById(R.id.image);
            final LinearLayout nothing = (LinearLayout) _view.findViewById(R.id.nothing);
            final LinearLayout linear6 = (LinearLayout) _view.findViewById(R.id.linear6);
            final LinearLayout propic_bg = (LinearLayout) _view.findViewById(R.id.propic_bg);
            final LinearLayout linear8 = (LinearLayout) _view.findViewById(R.id.linear8);
            final de.hdodenhof.circleimageview.CircleImageView circleimageview1 = (de.hdodenhof.circleimageview.CircleImageView) _view.findViewById(R.id.circleimageview1);
            final LinearLayout linear29 = (LinearLayout) _view.findViewById(R.id.linear29);
            final LinearLayout linear28 = (LinearLayout) _view.findViewById(R.id.linear28);
            final TextView textview1 = (TextView) _view.findViewById(R.id.textview1);
            final TextView time = (TextView) _view.findViewById(R.id.time);
            final TextView forMoreInfo = (TextView) _view.findViewById(R.id.forMoreInfo);
            final TextView link = (TextView) _view.findViewById(R.id.link);

            RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            _view.setLayoutParams(_lp);
            textview9.setTypeface(Typeface.createFromAsset(getParentActivity().getAssets(), "fonts/roboto_regular.ttf"), 0);
            textview1.setTypeface(Typeface.createFromAsset(getParentActivity().getAssets(), "fonts/rmedium.ttf"), 0);
            time.setTypeface(Typeface.createFromAsset(getParentActivity().getAssets(), "fonts/roboto_regular.ttf"), 0);
            forMoreInfo.setTypeface(Typeface.createFromAsset(getParentActivity().getAssets(), "fonts/roboto_regular.ttf"), 0);
            link.setTypeface(Typeface.createFromAsset(getParentActivity().getAssets(), "fonts/roboto_regular.ttf"), 0);
            CardView.setCardBackgroundColor(0xFFFFFFFF);
            CardView.setRadius((float) 7);
            CardView.setCardElevation((float) 3);
            CardView.setPreventCornerOverlap(true);
            CardView.setUseCompatPadding(true);
            if (_data.get((int) _position).containsKey("pid") && (_data.get((int) _position).containsKey("uid") && (_data.get((int) _position).containsKey("time") && (_data.get((int) _position).containsKey("text") || _data.get((int) _position).containsKey("image"))))) {
                if (_data.get((int) _position).containsKey("firstname") && _data.get((int) _position).containsKey("lastname")) {
                    textview1.setText(_data.get((int) _position).get("firstname").toString().concat(" ".concat(_data.get((int) _position).get("lastname").toString())));
                } else {
                    linear27.setVisibility(View.GONE);
                }
                if (_data.get((int) _position).containsKey("avatar")) {
                    Glide.with(getApplicationContext()).load(Uri.parse(_data.get((int) _position).get("avatar").toString())).into(circleimageview1);
                    circleimageview1.setVisibility(View.VISIBLE);
                }
                if (_data.get((int) _position).containsKey("text")) {
                    textview9.setVisibility(View.VISIBLE);
                    textview9.setText(_data.get((int) _position).get("text").toString());
                } else {
                    textview9.setVisibility(View.GONE);
                }
                if (_data.get((int) _position).containsKey("image")) {
                    image.setVisibility(View.VISIBLE);
                    com.bumptech.glide.Glide.with(getApplicationContext())
                            .load(_data.get((int) _position).get("image").toString())
                            .override(512, 512)
                            .into(image);
                } else {
                    image.setVisibility(View.GONE);
                }
                if (_data.get((int) _position).containsKey("time")) {
                    _Time(Double.parseDouble(_data.get((int) _position).get("time").toString()), time);
                }
            }
        }

        @Override
        public int getItemCount() {
            return _data.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ViewHolder(View v) {
                super(v);
            }
        }

    }
}