package com.rsouzat.renanviagens.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.rsouzat.renanviagens.model.Pacote;

public class ResourcesUtil {

  private static final String DRAWABLE = "drawable";

  @SuppressLint("UseCompatLoadingForDrawables")
  public static Drawable devolveDrawable(Context context, String drawableEmTexto) {
    Resources resources = context.getResources();
    int idDrawableImgLocal = resources.getIdentifier(drawableEmTexto, DRAWABLE, context.getPackageName());
    @SuppressLint("UseCompatLoadingForDrawables") Drawable drawableImgLocal;
    drawableImgLocal = resources.getDrawable(idDrawableImgLocal);
    return drawableImgLocal;
  }
}
