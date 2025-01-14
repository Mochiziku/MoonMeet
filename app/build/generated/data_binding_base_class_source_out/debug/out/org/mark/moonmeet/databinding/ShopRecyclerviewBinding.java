// Generated by view binder compiler. Do not edit!
package org.mark.moonmeet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.mark.moonmeet.R;

public final class ShopRecyclerviewBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button stickerAdd;

  @NonNull
  public final TextView stickerSubtitle;

  @NonNull
  public final TextView stickerTitle;

  @NonNull
  public final RecyclerView stickersRv;

  private ShopRecyclerviewBinding(@NonNull FrameLayout rootView, @NonNull Button stickerAdd,
      @NonNull TextView stickerSubtitle, @NonNull TextView stickerTitle,
      @NonNull RecyclerView stickersRv) {
    this.rootView = rootView;
    this.stickerAdd = stickerAdd;
    this.stickerSubtitle = stickerSubtitle;
    this.stickerTitle = stickerTitle;
    this.stickersRv = stickersRv;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ShopRecyclerviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShopRecyclerviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.shop_recyclerview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShopRecyclerviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.sticker_add;
      Button stickerAdd = ViewBindings.findChildViewById(rootView, id);
      if (stickerAdd == null) {
        break missingId;
      }

      id = R.id.sticker_subtitle;
      TextView stickerSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (stickerSubtitle == null) {
        break missingId;
      }

      id = R.id.sticker_title;
      TextView stickerTitle = ViewBindings.findChildViewById(rootView, id);
      if (stickerTitle == null) {
        break missingId;
      }

      id = R.id.stickers_rv;
      RecyclerView stickersRv = ViewBindings.findChildViewById(rootView, id);
      if (stickersRv == null) {
        break missingId;
      }

      return new ShopRecyclerviewBinding((FrameLayout) rootView, stickerAdd, stickerSubtitle,
          stickerTitle, stickersRv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
