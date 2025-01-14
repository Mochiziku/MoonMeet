// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.axemojiview.view.AXEmojiEditText;
import org.mark.moonmeet.R;

public final class NewstoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AXEmojiEditText edittext1;

  @NonNull
  public final AXEmojiEditText edittext2;

  @NonNull
  public final LinearLayout imageLin;

  @NonNull
  public final LinearLayout imagePicklin;

  @NonNull
  public final ImageView imageview2;

  @NonNull
  public final ImageView imageview4;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout linear3;

  @NonNull
  public final LinearLayout linear4;

  @NonNull
  public final LinearLayout picktypeLin;

  @NonNull
  public final ProgressBar progressbar1;

  @NonNull
  public final LinearLayout textLin;

  @NonNull
  public final LinearLayout textPicklin;

  @NonNull
  public final TextView textview1;

  @NonNull
  public final TextView textview2;

  @NonNull
  public final TextView textview4;

  @NonNull
  public final TextView textview5;

  private NewstoryBinding(@NonNull LinearLayout rootView, @NonNull AXEmojiEditText edittext1,
      @NonNull AXEmojiEditText edittext2, @NonNull LinearLayout imageLin,
      @NonNull LinearLayout imagePicklin, @NonNull ImageView imageview2,
      @NonNull ImageView imageview4, @NonNull LinearLayout linear1, @NonNull LinearLayout linear3,
      @NonNull LinearLayout linear4, @NonNull LinearLayout picktypeLin,
      @NonNull ProgressBar progressbar1, @NonNull LinearLayout textLin,
      @NonNull LinearLayout textPicklin, @NonNull TextView textview1, @NonNull TextView textview2,
      @NonNull TextView textview4, @NonNull TextView textview5) {
    this.rootView = rootView;
    this.edittext1 = edittext1;
    this.edittext2 = edittext2;
    this.imageLin = imageLin;
    this.imagePicklin = imagePicklin;
    this.imageview2 = imageview2;
    this.imageview4 = imageview4;
    this.linear1 = linear1;
    this.linear3 = linear3;
    this.linear4 = linear4;
    this.picktypeLin = picktypeLin;
    this.progressbar1 = progressbar1;
    this.textLin = textLin;
    this.textPicklin = textPicklin;
    this.textview1 = textview1;
    this.textview2 = textview2;
    this.textview4 = textview4;
    this.textview5 = textview5;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NewstoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewstoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.newstory, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewstoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edittext1;
      AXEmojiEditText edittext1 = ViewBindings.findChildViewById(rootView, id);
      if (edittext1 == null) {
        break missingId;
      }

      id = R.id.edittext2;
      AXEmojiEditText edittext2 = ViewBindings.findChildViewById(rootView, id);
      if (edittext2 == null) {
        break missingId;
      }

      id = R.id.image_lin;
      LinearLayout imageLin = ViewBindings.findChildViewById(rootView, id);
      if (imageLin == null) {
        break missingId;
      }

      id = R.id.image_picklin;
      LinearLayout imagePicklin = ViewBindings.findChildViewById(rootView, id);
      if (imagePicklin == null) {
        break missingId;
      }

      id = R.id.imageview2;
      ImageView imageview2 = ViewBindings.findChildViewById(rootView, id);
      if (imageview2 == null) {
        break missingId;
      }

      id = R.id.imageview4;
      ImageView imageview4 = ViewBindings.findChildViewById(rootView, id);
      if (imageview4 == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.linear3;
      LinearLayout linear3 = ViewBindings.findChildViewById(rootView, id);
      if (linear3 == null) {
        break missingId;
      }

      id = R.id.linear4;
      LinearLayout linear4 = ViewBindings.findChildViewById(rootView, id);
      if (linear4 == null) {
        break missingId;
      }

      id = R.id.picktype_lin;
      LinearLayout picktypeLin = ViewBindings.findChildViewById(rootView, id);
      if (picktypeLin == null) {
        break missingId;
      }

      id = R.id.progressbar1;
      ProgressBar progressbar1 = ViewBindings.findChildViewById(rootView, id);
      if (progressbar1 == null) {
        break missingId;
      }

      id = R.id.text_lin;
      LinearLayout textLin = ViewBindings.findChildViewById(rootView, id);
      if (textLin == null) {
        break missingId;
      }

      id = R.id.text_picklin;
      LinearLayout textPicklin = ViewBindings.findChildViewById(rootView, id);
      if (textPicklin == null) {
        break missingId;
      }

      id = R.id.textview1;
      TextView textview1 = ViewBindings.findChildViewById(rootView, id);
      if (textview1 == null) {
        break missingId;
      }

      id = R.id.textview2;
      TextView textview2 = ViewBindings.findChildViewById(rootView, id);
      if (textview2 == null) {
        break missingId;
      }

      id = R.id.textview4;
      TextView textview4 = ViewBindings.findChildViewById(rootView, id);
      if (textview4 == null) {
        break missingId;
      }

      id = R.id.textview5;
      TextView textview5 = ViewBindings.findChildViewById(rootView, id);
      if (textview5 == null) {
        break missingId;
      }

      return new NewstoryBinding((LinearLayout) rootView, edittext1, edittext2, imageLin,
          imagePicklin, imageview2, imageview4, linear1, linear3, linear4, picktypeLin,
          progressbar1, textLin, textPicklin, textview1, textview2, textview4, textview5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
