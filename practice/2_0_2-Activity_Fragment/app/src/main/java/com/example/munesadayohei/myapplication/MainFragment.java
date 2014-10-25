package com.example.munesadayohei.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by munesadayohei on 2014/10/26.
 */
public class MainFragment extends Fragment {

    private FragmentCallbacks mCallback;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Fragmentを構築する状態
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Fragmentが持つViewを構築する状態
        View view = inflater.inflate(R.layout.activity_my10, container);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        // ActivityのonCreateの状態の処理が終わったことを示す
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        // FragmentのUIが構築され、ユーザーに見える状態
        super.onStart();
    }

    @Override
    public void onResume() {
        // FragmentのUIが構築され、ユーザーとのインタラクションができるようになった状態
        super.onResume();
    }

    @Override
    public void onPause() {
        // ユーザーが別の画面への遷移を仕様としてFragmentから離れていこうとした状態
        super.onPause();
    }

    @Override
    public void onStop() {
        // Fragmentがユーザーに見えない状態
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        // Fragmentが扱うViewなどのコンポーネントに紐づいた各種リソースを解放するための状態
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        // Fragmentが完全にメモリから破棄される直前の状態
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        // FragmentがActivityから切り離される状態
        super.onDetach();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            mCallback = (FragmentCallbacks) activity;
        } catch (ClassCastException e) {
            throw  new IllegalStateException("activity should implement FragmentCallbacks", e);
        }
    }

    public static interface FragmentCallbacks {
        void onHogehoge();
    }
}
