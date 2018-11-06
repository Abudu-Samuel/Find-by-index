//package com.example.andeladeveloper.findbyindex;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.v4.view.PagerAdapter;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//public class ImageAdapter extends PagerAdapter {
//
//    Context context;
//
//    ImageAdapter(Context context) {
//        this.context = context;
//    }
//
//
//    @Override
//    public int getCount() {
//        return sliderImageId.length;
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view == object;
//    }
//
//    private int[] sliderImageId = new int[]{
//            R.drawable.summer_barbeque_feast, R.drawable.sbs_jollof, R.drawable.final_image
//    };
//
//    @Override
//    public Object instantiateItem(ViewGroup container, int position) {
//        ImageView imageView = new ImageView(context);
//        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//        imageView.setImageResource(sliderImageId[position]);
//        container.addView(imageView, 0);
//        return imageView;
//    }
//
//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView((ImageView) object);
//    }
//}
