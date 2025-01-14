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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class MainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView mediumTreeLeft;

  @NonNull
  public final ImageView mediumTreeRight;

  @NonNull
  public final LinearLayoutCompat moonFirstHolder;

  @NonNull
  public final LinearLayout moonSecondholder;

  @NonNull
  public final ImageView moonmeetLogo;

  @NonNull
  public final TextView moonmeetTxt;

  @NonNull
  public final ImageView smallTreeLeft;

  @NonNull
  public final ImageView smallTreeRight;

  @NonNull
  public final LinearLayout spaceInLow;

  @NonNull
  public final LinearLayout theBigMoonmeetHolder;

  @NonNull
  public final LinearLayout theLittleMoonHolder;

  @NonNull
  public final LinearLayout theMediumMoonmeetHolder;

  @NonNull
  public final LinearLayout theSmallMoonmeetHolder;

  @NonNull
  public final ImageView treeInMiddle;

  private MainBinding(@NonNull LinearLayout rootView, @NonNull ImageView mediumTreeLeft,
      @NonNull ImageView mediumTreeRight, @NonNull LinearLayoutCompat moonFirstHolder,
      @NonNull LinearLayout moonSecondholder, @NonNull ImageView moonmeetLogo,
      @NonNull TextView moonmeetTxt, @NonNull ImageView smallTreeLeft,
      @NonNull ImageView smallTreeRight, @NonNull LinearLayout spaceInLow,
      @NonNull LinearLayout theBigMoonmeetHolder, @NonNull LinearLayout theLittleMoonHolder,
      @NonNull LinearLayout theMediumMoonmeetHolder, @NonNull LinearLayout theSmallMoonmeetHolder,
      @NonNull ImageView treeInMiddle) {
    this.rootView = rootView;
    this.mediumTreeLeft = mediumTreeLeft;
    this.mediumTreeRight = mediumTreeRight;
    this.moonFirstHolder = moonFirstHolder;
    this.moonSecondholder = moonSecondholder;
    this.moonmeetLogo = moonmeetLogo;
    this.moonmeetTxt = moonmeetTxt;
    this.smallTreeLeft = smallTreeLeft;
    this.smallTreeRight = smallTreeRight;
    this.spaceInLow = spaceInLow;
    this.theBigMoonmeetHolder = theBigMoonmeetHolder;
    this.theLittleMoonHolder = theLittleMoonHolder;
    this.theMediumMoonmeetHolder = theMediumMoonmeetHolder;
    this.theSmallMoonmeetHolder = theSmallMoonmeetHolder;
    this.treeInMiddle = treeInMiddle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.medium_tree_left;
      ImageView mediumTreeLeft = ViewBindings.findChildViewById(rootView, id);
      if (mediumTreeLeft == null) {
        break missingId;
      }

      id = R.id.medium_tree_right;
      ImageView mediumTreeRight = ViewBindings.findChildViewById(rootView, id);
      if (mediumTreeRight == null) {
        break missingId;
      }

      id = R.id.moon_first_holder;
      LinearLayoutCompat moonFirstHolder = ViewBindings.findChildViewById(rootView, id);
      if (moonFirstHolder == null) {
        break missingId;
      }

      id = R.id.moon_secondholder;
      LinearLayout moonSecondholder = ViewBindings.findChildViewById(rootView, id);
      if (moonSecondholder == null) {
        break missingId;
      }

      id = R.id.moonmeet_logo;
      ImageView moonmeetLogo = ViewBindings.findChildViewById(rootView, id);
      if (moonmeetLogo == null) {
        break missingId;
      }

      id = R.id.moonmeet_txt;
      TextView moonmeetTxt = ViewBindings.findChildViewById(rootView, id);
      if (moonmeetTxt == null) {
        break missingId;
      }

      id = R.id.small_tree_left;
      ImageView smallTreeLeft = ViewBindings.findChildViewById(rootView, id);
      if (smallTreeLeft == null) {
        break missingId;
      }

      id = R.id.small_tree_right;
      ImageView smallTreeRight = ViewBindings.findChildViewById(rootView, id);
      if (smallTreeRight == null) {
        break missingId;
      }

      id = R.id.space_in_low;
      LinearLayout spaceInLow = ViewBindings.findChildViewById(rootView, id);
      if (spaceInLow == null) {
        break missingId;
      }

      id = R.id.the_big_moonmeet_holder;
      LinearLayout theBigMoonmeetHolder = ViewBindings.findChildViewById(rootView, id);
      if (theBigMoonmeetHolder == null) {
        break missingId;
      }

      id = R.id.the_little_moon_holder;
      LinearLayout theLittleMoonHolder = ViewBindings.findChildViewById(rootView, id);
      if (theLittleMoonHolder == null) {
        break missingId;
      }

      id = R.id.the_medium_moonmeet_holder;
      LinearLayout theMediumMoonmeetHolder = ViewBindings.findChildViewById(rootView, id);
      if (theMediumMoonmeetHolder == null) {
        break missingId;
      }

      id = R.id.the_small_moonmeet_holder;
      LinearLayout theSmallMoonmeetHolder = ViewBindings.findChildViewById(rootView, id);
      if (theSmallMoonmeetHolder == null) {
        break missingId;
      }

      id = R.id.tree_in_middle;
      ImageView treeInMiddle = ViewBindings.findChildViewById(rootView, id);
      if (treeInMiddle == null) {
        break missingId;
      }

      return new MainBinding((LinearLayout) rootView, mediumTreeLeft, mediumTreeRight,
          moonFirstHolder, moonSecondholder, moonmeetLogo, moonmeetTxt, smallTreeLeft,
          smallTreeRight, spaceInLow, theBigMoonmeetHolder, theLittleMoonHolder,
          theMediumMoonmeetHolder, theSmallMoonmeetHolder, treeInMiddle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
