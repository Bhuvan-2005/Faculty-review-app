package Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bhuvan.facultyreviewappclone.R;
import java.util.List;
import Utils.listOfTeachers;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context appContext;
    private List<listOfTeachers> facultyList;

    public Adapter(Context appContext, List<listOfTeachers> facultyList){
        this.appContext = appContext;
        this.facultyList = facultyList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(appContext).inflate(R.layout.listtemplate,parent,false));
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position){
        holder.facultyName.setText(facultyList.get(position).getFacultyName());
        holder.facultyID.setText(String.valueOf(facultyList.get(position).getFacultyID()));
        holder.facultySubject.setText(facultyList.get(position).getFacultySubject());
        holder.facultyImage.setImageResource(facultyList.get(position).getFacultyImage());
        final boolean[] isWhiteStar = {true};
        holder.rateFiveStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int starColour = isWhiteStar[0] ? R.raw.goldstar : R.raw.whitestar;
                holder.rateFiveStar.setBackgroundResource(starColour);
                isWhiteStar[0] = !isWhiteStar[0];
            }
        });
    }

    @Override
    public int getItemCount() {
        return facultyList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView facultyName,facultyID,facultySubject;
        private ImageView facultyImage;
        private ImageButton rateFiveStar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            facultyName = (TextView) itemView.findViewById(R.id.FnameID);
            facultyID = (TextView) itemView.findViewById(R.id.FidID);
            facultySubject = (TextView) itemView.findViewById(R.id.FsubjectID);
            facultyImage = (ImageView) itemView.findViewById(R.id.facultyImageID);
            rateFiveStar = (ImageButton) itemView.findViewById(R.id.fiveStarButtonID);
        }

        @Override
        public void onClick(View v) {
            int clickPosition = getAdapterPosition();
            listOfTeachers listClicked = facultyList.get(clickPosition);
            Toast.makeText(appContext,listClicked.getFacultyName(),Toast.LENGTH_SHORT).show();
        }
    }
}
