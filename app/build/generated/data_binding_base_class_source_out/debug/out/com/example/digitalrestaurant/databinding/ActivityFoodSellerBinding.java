// Generated by view binder compiler. Do not edit!
package com.example.digitalrestaurant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.digitalrestaurant.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFoodSellerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView areYouNewSell;

  @NonNull
  public final TextView foodSellerloginBut;

  @NonNull
  public final TextView foodsellerMenuKey;

  @NonNull
  public final TextView foodsellerSignupBut;

  @NonNull
  public final TextView textView;

  private ActivityFoodSellerBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView areYouNewSell, @NonNull TextView foodSellerloginBut,
      @NonNull TextView foodsellerMenuKey, @NonNull TextView foodsellerSignupBut,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.areYouNewSell = areYouNewSell;
    this.foodSellerloginBut = foodSellerloginBut;
    this.foodsellerMenuKey = foodsellerMenuKey;
    this.foodsellerSignupBut = foodsellerSignupBut;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFoodSellerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFoodSellerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_food_seller, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFoodSellerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.areYouNewSell;
      TextView areYouNewSell = ViewBindings.findChildViewById(rootView, id);
      if (areYouNewSell == null) {
        break missingId;
      }

      id = R.id.foodSellerloginBut;
      TextView foodSellerloginBut = ViewBindings.findChildViewById(rootView, id);
      if (foodSellerloginBut == null) {
        break missingId;
      }

      id = R.id.foodsellerMenuKey;
      TextView foodsellerMenuKey = ViewBindings.findChildViewById(rootView, id);
      if (foodsellerMenuKey == null) {
        break missingId;
      }

      id = R.id.foodsellerSignupBut;
      TextView foodsellerSignupBut = ViewBindings.findChildViewById(rootView, id);
      if (foodsellerSignupBut == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityFoodSellerBinding((ConstraintLayout) rootView, areYouNewSell,
          foodSellerloginBut, foodsellerMenuKey, foodsellerSignupBut, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}