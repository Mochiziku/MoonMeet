// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class StoryviewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageview1;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout noviewersyet;

  @NonNull
  public final MaterialTextView noviewersyetFullTxt;

  @NonNull
  public final MaterialTextView noviewersyetMiniTxt;

  @NonNull
  public final RecyclerView recyclerview1;

  @NonNull
  public final TextView textview1;

  private StoryviewBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageview1,
      @NonNull LinearLayout linear1, @NonNull LinearLayout noviewersyet,
      @NonNull MaterialTextView noviewersyetFullTxt, @NonNull MaterialTextView noviewersyetMiniTxt,
      @NonNull RecyclerView recyclerview1, @NonNull TextView textview1) {
    this.rootView = rootView;
    this.imageview1 = imageview1;
    this.linear1 = linear1;
    this.noviewersyet = noviewersyet;
    this.noviewersyetFullTxt = noviewersyetFullTxt;
    this.noviewersyetMiniTxt = noviewersyetMiniTxt;
    this.recyclerview1 = recyclerview1;
    this.textview1 = textview1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StoryviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StoryviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.storyview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StoryviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageview1;
      ImageView imageview1 = ViewBindings.findChildViewById(rootView, id);
      if (imageview1 == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.noviewersyet;
      LinearLayout noviewersyet = ViewBindings.findChildViewById(rootView, id);
      if (noviewersyet == null) {
        break missingId;
      }

      id = R.id.noviewersyet_full_txt;
      MaterialTextView noviewersyetFullTxt = ViewBindings.findChildViewById(rootView, id);
      if (noviewersyetFullTxt == null) {
        break missingId;
      }

      id = R.id.noviewersyet_mini_txt;
      MaterialTextView noviewersyetMiniTxt = ViewBindings.findChildViewById(rootView, id);
      if (noviewersyetMiniTxt == null) {
        break missingId;
      }

      id = R.id.recyclerview1;
      RecyclerView recyclerview1 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview1 == null) {
        break missingId;
      }

      id = R.id.textview1;
      TextView textview1 = ViewBindings.findChildViewById(rootView, id);
      if (textview1 == null) {
        break missingId;
      }

      return new StoryviewBinding((LinearLayout) rootView, imageview1, linear1, noviewersyet,
          noviewersyetFullTxt, noviewersyetMiniTxt, recyclerview1, textview1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
