// Generated code from Butter Knife. Do not modify!
package com.lunar.bestVPN.fragments;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.lunar.bestVPN.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VipServersFragment_ViewBinding implements Unbinder {
  private VipServersFragment target;

  @UiThread
  public VipServersFragment_ViewBinding(VipServersFragment target, View source) {
    this.target = target;

    target.VIPServersRecyclerview = Utils.findRequiredViewAsType(source, R.id.freeServersRecyclerview, "field 'VIPServersRecyclerview'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VipServersFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.VIPServersRecyclerview = null;
  }
}
