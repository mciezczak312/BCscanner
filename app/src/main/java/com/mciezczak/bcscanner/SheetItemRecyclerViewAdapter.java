package com.mciezczak.bcscanner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mciezczak.bcscanner.SheetItemFragment.OnListFragmentInteractionListener;
import com.mciezczak.bcscanner.model.DataSheet;


import java.util.List;


public class SheetItemRecyclerViewAdapter extends RecyclerView.Adapter<SheetItemRecyclerViewAdapter.ViewHolder> {

    private final List<DataSheet> mValues;
    private final OnListFragmentInteractionListener mListener;

    public SheetItemRecyclerViewAdapter(List<DataSheet> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.fragment_sheetitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNameView.setText(mValues.get(position).name);
        holder.mWarehouseView.setText(mValues.get(position).warehouse);
        holder.mDateView.setText(mValues.get(position).modified_on.toString());
        holder.mCountView.setText("997");

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public  TextView mNameView;
        public  TextView mWarehouseView;
        public  TextView mDateView;
        public  TextView mCountView;
        public DataSheet mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mNameView = (TextView) view.findViewById(R.id.sheet_name);
            mWarehouseView = (TextView) view.findViewById(R.id.warehouse);
            mDateView = (TextView) view.findViewById(R.id.modified);
            mCountView = (TextView) view.findViewById(R.id.count);

            //mContentView = (TextView) view.findViewById(R.id.content);
        }

    }
}
