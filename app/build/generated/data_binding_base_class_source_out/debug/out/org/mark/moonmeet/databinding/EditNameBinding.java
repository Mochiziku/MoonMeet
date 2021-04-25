// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class EditNameBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final LinearLayout base;

  @NonNull
  public final LinearLayout divider;

  @NonNull
  public final ImageView done;

  @NonNull
  public final LinearLayout firstnameDivider;

  @NonNull
  public final EditText firstnameEdittext;

  @NonNull
  public final LinearLayout firstnameHolder;

  @NonNull
  public final RelativeLayout holder;

  @NonNull
  public final LinearLayout lastnameDivider;

  @NonNull
  public final EditText lastnameEdittext;

  @NonNull
  public final LinearLayout lastnameHolder;

  @NonNull
  public final LinearLayout spaceBetween;

  @NonNull
  public final LinearLayout spaceBetweenTop;

  @NonNull
  public final LinearLayout topbar;

  @NonNull
  public final TextView topbarTxt;

  private EditNameBinding(@NonNull LinearLayout rootView, @NonNull ImageView back,
      @NonNull LinearLayout base, @NonNull LinearLayout divider, @NonNull ImageView done,
      @NonNull LinearLayout firstnameDivider, @NonNull EditText firstnameEdittext,
      @NonNull LinearLayout firstnameHolder, @NonNull RelativeLayout holder,
      @NonNull LinearLayout lastnameDivider, @NonNull EditText lastnameEdittext,
      @NonNull LinearLayout lastnameHolder, @NonNull LinearLayout spaceBetween,
      @NonNull LinearLayout spaceBetweenTop, @NonNull LinearLayout topbar,
      @NonNull TextView topbarTxt) {
    this.rootView = rootView;
    this.back = back;
    this.base = base;
    this.divider = divider;
    this.done = done;
    this.firstnameDivider = firstnameDivider;
    this.firstnameEdittext = firstnameEdittext;
    this.firstnameHolder = firstnameHolder;
    this.holder = holder;
    this.lastnameDivider = lastnameDivider;
    this.lastnameEdittext = lastnameEdittext;
    this.lastnameHolder = lastnameHolder;
    this.spaceBetween = spaceBetween;
    this.spaceBetweenTop = spaceBetweenTop;
    this.topbar = topbar;
    this.topbarTxt = topbarTxt;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EditNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.edit_name, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditNameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.base;
      LinearLayout base = ViewBindings.findChildViewById(rootView, id);
      if (base == null) {
        break missingId;
      }

      id = R.id.divider;
      LinearLayout divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.done;
      ImageView done = ViewBindings.findChildViewById(rootView, id);
      if (done == null) {
        break missingId;
      }

      id = R.id.firstname_divider;
      LinearLayout firstnameDivider = ViewBindings.findChildViewById(rootView, id);
      if (firstnameDivider == null) {
        break missingId;
      }

      id = R.id.firstname_edittext;
      EditText firstnameEdittext = ViewBindings.findChildViewById(rootView, id);
      if (firstnameEdittext == null) {
        break missingId;
      }

      id = R.id.firstname_holder;
      LinearLayout firstnameHolder = ViewBindings.findChildViewById(rootView, id);
      if (firstnameHolder == null) {
        break missingId;
      }

      id = R.id.holder;
      RelativeLayout holder = ViewBindings.findChildViewById(rootView, id);
      if (holder == null) {
        break missingId;
      }

      id = R.id.lastname_divider;
      LinearLayout lastnameDivider = ViewBindings.findChildViewById(rootView, id);
      if (lastnameDivider == null) {
        break missingId;
      }

      id = R.id.lastname_edittext;
      EditText lastnameEdittext = ViewBindings.findChildViewById(rootView, id);
      if (lastnameEdittext == null) {
        break missingId;
      }

      id = R.id.lastname_holder;
      LinearLayout lastnameHolder = ViewBindings.findChildViewById(rootView, id);
      if (lastnameHolder == null) {
        break missingId;
      }

      id = R.id.space_between;
      LinearLayout spaceBetween = ViewBindings.findChildViewById(rootView, id);
      if (spaceBetween == null) {
        break missingId;
      }

      id = R.id.space_between_top;
      LinearLayout spaceBetweenTop = ViewBindings.findChildViewById(rootView, id);
      if (spaceBetweenTop == null) {
        break missingId;
      }

      id = R.id.topbar;
      LinearLayout topbar = ViewBindings.findChildViewById(rootView, id);
      if (topbar == null) {
        break missingId;
      }

      id = R.id.topbar_txt;
      TextView topbarTxt = ViewBindings.findChildViewById(rootView, id);
      if (topbarTxt == null) {
        break missingId;
      }

      return new EditNameBinding((LinearLayout) rootView, back, base, divider, done,
          firstnameDivider, firstnameEdittext, firstnameHolder, holder, lastnameDivider,
          lastnameEdittext, lastnameHolder, spaceBetween, spaceBetweenTop, topbar, topbarTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}