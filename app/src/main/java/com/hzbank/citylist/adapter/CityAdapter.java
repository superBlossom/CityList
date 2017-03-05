package com.hzbank.citylist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.hzbank.citylist.R;
import com.hzbank.citylist.bean.CityBean;
import com.hzbank.citylist.utils.CommonAdapter;
import com.hzbank.citylist.utils.Constance;
import com.hzbank.citylist.utils.ViewHolder;

import java.util.List;

/**
 * Created by zp on 2016/12/13.
 */

public class CityAdapter extends CommonAdapter<CityBean> {
    private int locateState= Constance.LOCATING;
    public CityAdapter(Context context, int layoutId, List<CityBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(ViewHolder holder, CityBean cityBean) {
        holder.setText(R.id.tvCity,cityBean.getCityName());

    }


}
