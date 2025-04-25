package com.bhuvan.facultyreviewappclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.bhuvan.facultyreviewappclone.R;
import java.util.ArrayList;
import java.util.List;
import Adapters.Adapter;
import Utils.listOfTeachers;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instantiateLayoutContents();
        setupLayoutContents();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    void instantiateLayoutContents(){
        recyclerView = (RecyclerView) findViewById(R.id.recyID);
    }

    void setupLayoutContents(){
        List<listOfTeachers> teachersList = new ArrayList<>();
        teachersList.add(new listOfTeachers("Bhuvan",12554,"Java",R.raw.itachiwallpaper));
        teachersList.add(new listOfTeachers("Kaustubh",15281,"OOPS",R.raw.josephteacher));
        teachersList.add(new listOfTeachers("Someone",19343,"DSA",R.raw.kalilinuxflamingdragon));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),teachersList));
    }
}