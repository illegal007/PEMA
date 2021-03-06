package com.example.pema;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

public class DatePickerFragment extends DialogFragment {

    DatePickerDialog.OnDateSetListener ondateSet;
    private int year,month,day;

    public DatePickerFragment() {

    }

    public void setCallBack (DatePickerDialog.OnDateSetListener ondate)
    {
        this.ondateSet = ondate;
    }

    @SuppressLint("NewApi")
    @Override
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        year = args.getInt("year");
        month = args.getInt("month");
        day = args.getInt("day");
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(),ondateSet,year,month,day);
    }
}
