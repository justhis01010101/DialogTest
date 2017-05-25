package youn0045.kr.hs.emirim.dialogtest;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] itemArr={"저스디스","서출구","헉피","창모"};
    Button but_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_dialog = (Button)findViewById(R.id.but_dialog);

        but_dialog.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dialog= new AlertDialog.Builder(this);

        dialog.setTitle("내가 낳은 별");
        dialog.setIcon(R.drawable.star);
        //dialog.setMessage("메시지");

        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                but_dialog.setText(itemArr[i]);
                Toast.makeText(MainActivity.this, "저즈디즈 짱짱", Toast.LENGTH_SHORT).show();

            }
        }); //선택된 항목이 바뀌었을 때

        dialog.setPositiveButton("보가",null);
        dialog.setNegativeButton("다른거", null);

        dialog.show();


    }
}
