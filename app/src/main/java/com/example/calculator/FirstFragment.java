package com.example.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.calculator.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    private TextView numberView;
    private TextView numberHistory;
    private Button num;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num10;
    private Button num11;
    private Button num12;
    private Button num13;
    private Button num14;
    private Button num15;

    String operation = "";
    String history = "";


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        View view = inflater.inflate(R.layout.fragment_first,container, false);



        numberView = (TextView) view.findViewById(R.id.numberView);
        numberHistory = (TextView) view.findViewById(R.id.numberHistory);
        num = (Button) view.findViewById(R.id.num);
        num1 = (Button) view.findViewById(R.id.num1);
        num2 = (Button) view.findViewById(R.id.num2);
        num3 = (Button) view.findViewById(R.id.num3);
        num4 = (Button) view.findViewById(R.id.num4);
        num5 = (Button) view.findViewById(R.id.num5);
        num6 = (Button) view.findViewById(R.id.num6);
        num7 = (Button) view.findViewById(R.id.num7);
        num8 = (Button) view.findViewById(R.id.num8);
        num9 = (Button) view.findViewById(R.id.num9);
        num10 = (Button) view.findViewById(R.id.num10);
        num11 = (Button) view.findViewById(R.id.num11);
        num12 = (Button) view.findViewById(R.id.num12);
        num13 = (Button) view.findViewById(R.id.num13);
        num14 = (Button) view.findViewById(R.id.num14);
        num15 = (Button) view.findViewById(R.id.num15);


        updateView();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.num:
                        operation = operation + 1;
                        break;
                    case R.id.num1:
                        operation = operation + 2;
                        break;
                    case R.id.num2:
                        operation = operation + 3;
                        break;
                    case R.id.num3:
                        operation = operation + '+';
                        break;
                    case R.id.num4:
                        operation = operation + 4;
                        break;
                    case R.id.num5:
                        operation = operation + 5;
                        break;
                    case R.id.num6:
                        operation = operation + 6;
                        break;
                    case R.id.num7:
                        operation = operation + '-';
                        break;
                    case R.id.num8:
                        operation = operation + 7;
                        break;
                    case R.id.num9:
                        operation = operation + 8;
                        break;
                    case R.id.num10:
                        operation = operation + 9;
                        break;
                    case R.id.num11:
                        operation = operation + '*';
                        break;
                    case R.id.num12:
                        operation = "";
                        break;
                    case R.id.num13:
                        operation = operation + 0;
                        break;
                    case R.id.num14:
                        operation = operation + '/';
                        break;
                    case R.id.num15:
                        try {
                            if(!operation.equals("")) {
                                int results;
                            }
                        }catch (Exception e){
                            e.getCause();
                        }

                        history = operation;
                        break;
                }
                updateView();
            }
        };

        num.setOnClickListener(listener);
        num1.setOnClickListener(listener);
        num2.setOnClickListener(listener);
        num3.setOnClickListener(listener);
        num4.setOnClickListener(listener);
        num5.setOnClickListener(listener);
        num6.setOnClickListener(listener);
        num7.setOnClickListener(listener);
        num8.setOnClickListener(listener);
        num9.setOnClickListener(listener);
        num10.setOnClickListener(listener);
        num11.setOnClickListener(listener);
        num12.setOnClickListener(listener);
        num13.setOnClickListener(listener);
        num14.setOnClickListener(listener);
        num15.setOnClickListener(listener);

        return view;

    }

    public void updateView () {
        numberView.setText(operation);
        numberHistory.setText(history);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}