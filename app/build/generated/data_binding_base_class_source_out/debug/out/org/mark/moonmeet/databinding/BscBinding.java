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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class BscBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout item1;

  @NonNull
  public final ImageView item1Img;

  @NonNull
  public final LinearLayout item1Lin;

  @NonNull
  public final TextView item1Txt;

  @NonNull
  public final LinearLayout item2;

  @NonNull
  public final ImageView item2Img;

  @NonNull
  public final LinearLayout item2Lin;

  @NonNull
  public final TextView item2Txt;

  @NonNull
  public final LinearLayout item3;

  @NonNull
  public final ImageView item3Img;

  @NonNull
  public final LinearLayout item3Lin;

  @NonNull
  public final TextView item3Txt;

  @NonNull
  public final LinearLayout item4;

  @NonNull
  public final ImageView item4Img;

  @NonNull
  public final LinearLayout item4Lin;

  @NonNull
  public final TextView item4Txt;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout linear6;

  @NonNull
  public final LinearLayout topLin;

  @NonNull
  public final TextView ttl1Txt;

  @NonNull
  public final TextView ttl2Txt;

  private BscBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout item1,
      @NonNull ImageView item1Img, @NonNull LinearLayout item1Lin, @NonNull TextView item1Txt,
      @NonNull LinearLayout item2, @NonNull ImageView item2Img, @NonNull LinearLayout item2Lin,
      @NonNull TextView item2Txt, @NonNull LinearLayout item3, @NonNull ImageView item3Img,
      @NonNull LinearLayout item3Lin, @NonNull TextView item3Txt, @NonNull LinearLayout item4,
      @NonNull ImageView item4Img, @NonNull LinearLayout item4Lin, @NonNull TextView item4Txt,
      @NonNull LinearLayout linear1, @NonNull LinearLayout linear6, @NonNull LinearLayout topLin,
      @NonNull TextView ttl1Txt, @NonNull TextView ttl2Txt) {
    this.rootView = rootView;
    this.item1 = item1;
    this.item1Img = item1Img;
    this.item1Lin = item1Lin;
    this.item1Txt = item1Txt;
    this.item2 = item2;
    this.item2Img = item2Img;
    this.item2Lin = item2Lin;
    this.item2Txt = item2Txt;
    this.item3 = item3;
    this.item3Img = item3Img;
    this.item3Lin = item3Lin;
    this.item3Txt = item3Txt;
    this.item4 = item4;
    this.item4Img = item4Img;
    this.item4Lin = item4Lin;
    this.item4Txt = item4Txt;
    this.linear1 = linear1;
    this.linear6 = linear6;
    this.topLin = topLin;
    this.ttl1Txt = ttl1Txt;
    this.ttl2Txt = ttl2Txt;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BscBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BscBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.bsc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BscBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item1;
      LinearLayout item1 = ViewBindings.findChildViewById(rootView, id);
      if (item1 == null) {
        break missingId;
      }

      id = R.id.item1_img;
      ImageView item1Img = ViewBindings.findChildViewById(rootView, id);
      if (item1Img == null) {
        break missingId;
      }

      id = R.id.item1_lin;
      LinearLayout item1Lin = ViewBindings.findChildViewById(rootView, id);
      if (item1Lin == null) {
        break missingId;
      }

      id = R.id.item1_txt;
      TextView item1Txt = ViewBindings.findChildViewById(rootView, id);
      if (item1Txt == null) {
        break missingId;
      }

      id = R.id.item2;
      LinearLayout item2 = ViewBindings.findChildViewById(rootView, id);
      if (item2 == null) {
        break missingId;
      }

      id = R.id.item2_img;
      ImageView item2Img = ViewBindings.findChildViewById(rootView, id);
      if (item2Img == null) {
        break missingId;
      }

      id = R.id.item2_lin;
      LinearLayout item2Lin = ViewBindings.findChildViewById(rootView, id);
      if (item2Lin == null) {
        break missingId;
      }

      id = R.id.item2_txt;
      TextView item2Txt = ViewBindings.findChildViewById(rootView, id);
      if (item2Txt == null) {
        break missingId;
      }

      id = R.id.item3;
      LinearLayout item3 = ViewBindings.findChildViewById(rootView, id);
      if (item3 == null) {
        break missingId;
      }

      id = R.id.item3_img;
      ImageView item3Img = ViewBindings.findChildViewById(rootView, id);
      if (item3Img == null) {
        break missingId;
      }

      id = R.id.item3_lin;
      LinearLayout item3Lin = ViewBindings.findChildViewById(rootView, id);
      if (item3Lin == null) {
        break missingId;
      }

      id = R.id.item3_txt;
      TextView item3Txt = ViewBindings.findChildViewById(rootView, id);
      if (item3Txt == null) {
        break missingId;
      }

      id = R.id.item4;
      LinearLayout item4 = ViewBindings.findChildViewById(rootView, id);
      if (item4 == null) {
        break missingId;
      }

      id = R.id.item4_img;
      ImageView item4Img = ViewBindings.findChildViewById(rootView, id);
      if (item4Img == null) {
        break missingId;
      }

      id = R.id.item4_lin;
      LinearLayout item4Lin = ViewBindings.findChildViewById(rootView, id);
      if (item4Lin == null) {
        break missingId;
      }

      id = R.id.item4_txt;
      TextView item4Txt = ViewBindings.findChildViewById(rootView, id);
      if (item4Txt == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.linear6;
      LinearLayout linear6 = ViewBindings.findChildViewById(rootView, id);
      if (linear6 == null) {
        break missingId;
      }

      id = R.id.top_lin;
      LinearLayout topLin = ViewBindings.findChildViewById(rootView, id);
      if (topLin == null) {
        break missingId;
      }

      id = R.id.ttl1_txt;
      TextView ttl1Txt = ViewBindings.findChildViewById(rootView, id);
      if (ttl1Txt == null) {
        break missingId;
      }

      id = R.id.ttl2_txt;
      TextView ttl2Txt = ViewBindings.findChildViewById(rootView, id);
      if (ttl2Txt == null) {
        break missingId;
      }

      return new BscBinding((LinearLayout) rootView, item1, item1Img, item1Lin, item1Txt, item2,
          item2Img, item2Lin, item2Txt, item3, item3Img, item3Lin, item3Txt, item4, item4Img,
          item4Lin, item4Txt, linear1, linear6, topLin, ttl1Txt, ttl2Txt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}