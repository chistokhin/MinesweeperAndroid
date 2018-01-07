package com.curdflappers.minesweeper;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.widget.RelativeLayout;

public class SpotView extends AppCompatImageView {
    public Spot spot;

    public SpotView(Context context) {
        this(context, 0, 0, 0);
    }

    public SpotView(Context context, int sideLength, float x, float y) {
        super(context);
        setImageResource(R.drawable.unrevealed);
        RelativeLayout.LayoutParams params =
                new RelativeLayout.LayoutParams(sideLength, sideLength);
        setLayoutParams(params);
        setX(x);
        setY(y);
    }

    public void update() {
        if(!spot.getRevealed() && !spot.getFlagged())
        {
            setImageResource(R.drawable.unrevealed);
            return;
        }

        if(spot.getFlagged()) {
            if(spot.getRevealed() && !spot.getMine())
                setImageResource(R.drawable.false_flag);
            else
                setImageResource(R.drawable.flag);
            return;
        }

        // at this point the spot is definitely revealed and unflagged
        if(spot.getMine())
            if(spot.getExploded())
                setImageResource(R.drawable.exploded_mine);
            else
                setImageResource(R.drawable.mine);
        else {
            switch (spot.getNeighboringMines()) {
                case (0):
                    setImageResource(R.drawable.num_0);
                    break;
                case (1):
                    setImageResource(R.drawable.num_1);
                    break;
                case (2):
                    setImageResource(R.drawable.num_2);
                    break;
                case (3):
                    setImageResource(R.drawable.num_3);
                    break;
                case (4):
                    setImageResource(R.drawable.num_4);
                    break;
                case (5):
                    setImageResource(R.drawable.num_5);
                    break;
                case (6):
                    setImageResource(R.drawable.num_6);
                    break;
                case (7):
                    setImageResource(R.drawable.num_7);
                    break;
                case (8):
                    setImageResource(R.drawable.num_8);
                    break;
            }
        }
    }
}
