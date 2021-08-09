// Generated by view binder compiler. Do not edit!
package com.example.sandeep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.sandeep.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutAddUserDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btSubmit;

  @NonNull
  public final EditText etUserCity;

  @NonNull
  public final EditText etUserName;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvHeader;

  private LayoutAddUserDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btSubmit, @NonNull EditText etUserCity, @NonNull EditText etUserName,
      @NonNull ProgressBar progressBar, @NonNull TextView tvHeader) {
    this.rootView = rootView;
    this.btSubmit = btSubmit;
    this.etUserCity = etUserCity;
    this.etUserName = etUserName;
    this.progressBar = progressBar;
    this.tvHeader = tvHeader;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutAddUserDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutAddUserDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_add_user_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutAddUserDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btSubmit;
      AppCompatButton btSubmit = rootView.findViewById(id);
      if (btSubmit == null) {
        break missingId;
      }

      id = R.id.etUserCity;
      EditText etUserCity = rootView.findViewById(id);
      if (etUserCity == null) {
        break missingId;
      }

      id = R.id.etUserName;
      EditText etUserName = rootView.findViewById(id);
      if (etUserName == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.tvHeader;
      TextView tvHeader = rootView.findViewById(id);
      if (tvHeader == null) {
        break missingId;
      }

      return new LayoutAddUserDetailsBinding((ConstraintLayout) rootView, btSubmit, etUserCity,
          etUserName, progressBar, tvHeader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}