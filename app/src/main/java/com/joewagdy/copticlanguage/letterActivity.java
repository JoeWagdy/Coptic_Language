package com.joewagdy.copticlanguage;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import java.util.Objects;

public class letterActivity extends AppCompatActivity {
    private String letter;
    private VideoView videoView;
    private TextView spelling;
    private ImageView letterImage;
    private RadioGroup spellings;
    private TextView ruleTextView;
    private ImageView exampleImage;
    private RadioGroup.OnCheckedChangeListener spellingChange = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (letter.equals(getString(R.string.letter02))) {
                if (checkedId == R.id.radioButton2) {
                    ruleTextView.setText(R.string.l2k2);
                } else if (checkedId == R.id.radioButton1) {
                    ruleTextView.setText(R.string.l2k1);
                }
            }
            else if (letter.equals(getString(R.string.letter03))) {
                if (checkedId == R.id.radioButton2) {
                    ruleTextView.setText(R.string.l3k2);
                } else if (checkedId == R.id.radioButton1) {
                    ruleTextView.setText(R.string.l3k1);
                } else {
                    ruleTextView.setText(R.string.l3k3);
                }
            }
            else if (letter.equals(getString(R.string.letter04))) {
                if (checkedId == R.id.radioButton2) {
                    ruleTextView.setText(R.string.l4k2);
                } else if (checkedId == R.id.radioButton1) {
                    ruleTextView.setText(R.string.l4k1);
                }
            }
            else if (letter.equals(getString(R.string.letter09))) {
                if (checkedId == R.id.radioButton2) {
                    ruleTextView.setText(R.string.l9k2);
                } else if (checkedId == R.id.radioButton1) {
                    ruleTextView.setText(R.string.l9k1);
                }
            }
            else if (letter.equals(getString(R.string.letter20))) {
                if (checkedId == R.id.radioButton2) {
                    ruleTextView.setText(R.string.l20k2);
                } else if (checkedId == R.id.radioButton1) {
                    ruleTextView.setText(R.string.l20k1);
                }
            }
            else if (letter.equals(getString(R.string.letter21))) {
                if (checkedId == R.id.radioButton2) {
                    ruleTextView.setText(R.string.l21k2);
                } else if (checkedId == R.id.radioButton1) {
                    ruleTextView.setText(R.string.l21k1);
                } else {
                    ruleTextView.setText(R.string.l21k3);
                }
            }
            else if (letter.equals(getString(R.string.letter23))) {
                if (checkedId == R.id.radioButton2) {
                    ruleTextView.setText(R.string.l23k2);
                } else if (checkedId == R.id.radioButton1) {
                    ruleTextView.setText(R.string.l23k1);
                } else {
                    ruleTextView.setText(R.string.l23k3);
                }
            }
            else if (letter.equals(getString(R.string.letter30))) {
                if (checkedId == R.id.radioButton2) {
                    ruleTextView.setText(R.string.l30k2);
                } else if (checkedId == R.id.radioButton1) {
                    ruleTextView.setText(R.string.l30k1);
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        letter = getIntent().getStringExtra("tag");
        setTitle(letter);
        videoView = findViewById(R.id.videoView);
        spelling = findViewById(R.id.spelling);
        letterImage = findViewById(R.id.letterImage);
        spellings = findViewById(R.id.toggleGroup);
        spellings.setOnCheckedChangeListener(spellingChange);
        ruleTextView = findViewById(R.id.ruleTextView);
        exampleImage = findViewById(R.id.exImage);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        checkLetter();
        videoView.start();
    }

    private void checkLetter() {
        if (letter.equals(getString(R.string.letter01))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid1);
            letterImage.setImageResource(R.drawable.letter01);
            spelling.setText(R.string.letter01a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l1n);
            ruleTextView.setText(R.string.l1);
            exampleImage.setImageResource(R.drawable.klmap01);
        } else if (letter.equals(getString(R.string.letter02))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid2);
            letterImage.setImageResource(R.drawable.letter02);
            spelling.setText(R.string.letter02a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(1)).setText(R.string.l2n2);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l2n1);
            ruleTextView.setText(R.string.l2k1);
            exampleImage.setImageResource(R.drawable.klmap02);
        } else if (letter.equals(getString(R.string.letter03))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid3);
            letterImage.setImageResource(R.drawable.letter03);
            spelling.setText(R.string.letter03a);
            spellings.getChildAt(0).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(0)).setText(R.string.l3n3);
            spellings.getChildAt(1).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(1)).setText(R.string.l3n2);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l3n1);
            ruleTextView.setText(R.string.l3k1);
            exampleImage.setImageResource(R.drawable.klmap03);
        } else if (letter.equals(getString(R.string.letter04))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid4);
            letterImage.setImageResource(R.drawable.letter04);
            spelling.setText(R.string.letter04a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(1)).setText(R.string.l4n2);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l4n1);
            ruleTextView.setText(R.string.l4k1);
            exampleImage.setImageResource(R.drawable.klmap04);
        } else if (letter.equals(getString(R.string.letter05))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid5);
            letterImage.setImageResource(R.drawable.letter05);
            spelling.setText(R.string.letter05a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l5n);
            ruleTextView.setText(R.string.l5);
            exampleImage.setImageResource(R.drawable.klmap05);
        } else if (letter.equals(getString(R.string.letter06))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid6);
            letterImage.setImageResource(R.drawable.letter06);
            spelling.setText(R.string.letter06a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l6n);
            ruleTextView.setText(R.string.l6);
            exampleImage.setImageResource(R.drawable.klmap06);
        } else if (letter.equals(getString(R.string.letter07))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid7);
            letterImage.setImageResource(R.drawable.letter07);
            spelling.setText(R.string.letter07a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l7n);
            ruleTextView.setText(R.string.l7);
            exampleImage.setImageResource(R.drawable.klmap07);
        } else if (letter.equals(getString(R.string.letter08))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid8);
            letterImage.setImageResource(R.drawable.letter08);
            spelling.setText(R.string.letter08a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l8n);
            ruleTextView.setText(R.string.l8);
            exampleImage.setImageResource(R.drawable.klmap08);
        } else if (letter.equals(getString(R.string.letter09))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid9);
            letterImage.setImageResource(R.drawable.letter09);
            spelling.setText(R.string.letter09a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(1)).setText(R.string.l9n2);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l9n1);
            ruleTextView.setText(R.string.l9k1);
            exampleImage.setImageResource(R.drawable.klmap09);
        } else if (letter.equals(getString(R.string.letter10))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid10);
            letterImage.setImageResource(R.drawable.letter10);
            spelling.setText(R.string.letter10a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l10n);
            ruleTextView.setText(R.string.l10);
            exampleImage.setImageResource(R.drawable.klmap10);
        } else if (letter.equals(getString(R.string.letter11))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid11);
            letterImage.setImageResource(R.drawable.letter11);
            spelling.setText(R.string.letter11a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l11n);
            ruleTextView.setText(R.string.l11);
            exampleImage.setImageResource(R.drawable.klmap11);
        } else if (letter.equals(getString(R.string.letter12))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid12);
            letterImage.setImageResource(R.drawable.letter12);
            spelling.setText(R.string.letter12a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l12n);
            ruleTextView.setText(R.string.l12);
            exampleImage.setImageResource(R.drawable.klmap12);
        } else if (letter.equals(getString(R.string.letter13))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid13);
            letterImage.setImageResource(R.drawable.letter13);
            spelling.setText(R.string.letter13a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l13n);
            ruleTextView.setText(R.string.l13);
            exampleImage.setImageResource(R.drawable.klmap13);
        } else if (letter.equals(getString(R.string.letter14))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid14);
            letterImage.setImageResource(R.drawable.letter14);
            spelling.setText(R.string.letter14a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l14n);
            ruleTextView.setText(R.string.l14);
            exampleImage.setImageResource(R.drawable.klmap14);
        } else if (letter.equals(getString(R.string.letter15))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid15);
            letterImage.setImageResource(R.drawable.letter15);
            spelling.setText(R.string.letter15a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l15n);
            ruleTextView.setText(R.string.l15);
            exampleImage.setImageResource(R.drawable.klmap15);
        } else if (letter.equals(getString(R.string.letter16))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid16);
            letterImage.setImageResource(R.drawable.letter16);
            spelling.setText(R.string.letter16a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l16n);
            ruleTextView.setText(R.string.l16);
            exampleImage.setImageResource(R.drawable.klmap16);
        } else if (letter.equals(getString(R.string.letter17))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid17);
            letterImage.setImageResource(R.drawable.letter17);
            spelling.setText(R.string.letter17a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l17n);
            ruleTextView.setText(R.string.l17);
            exampleImage.setImageResource(R.drawable.klmap17);
        } else if (letter.equals(getString(R.string.letter18))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid18);
            letterImage.setImageResource(R.drawable.letter18);
            spelling.setText(R.string.letter18a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l18n);
            ruleTextView.setText(R.string.l18);
            exampleImage.setImageResource(R.drawable.klmap18);
        } else if (letter.equals(getString(R.string.letter19))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid19);
            letterImage.setImageResource(R.drawable.letter19);
            spelling.setText(R.string.letter19a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l19n);
            ruleTextView.setText(R.string.l19);
            exampleImage.setImageResource(R.drawable.klmap19);
        } else if (letter.equals(getString(R.string.letter20))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid20);
            letterImage.setImageResource(R.drawable.letter20);
            spelling.setText(R.string.letter20a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(1)).setText(R.string.l20n2);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l20n1);
            ruleTextView.setText(R.string.l20k1);
            exampleImage.setImageResource(R.drawable.klmap20);
        } else if (letter.equals(getString(R.string.letter21))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid21);
            letterImage.setImageResource(R.drawable.letter21);
            spelling.setText(R.string.letter21a);
            spellings.getChildAt(0).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(0)).setText(R.string.l21n3);
            spellings.getChildAt(1).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(1)).setText(R.string.l21n2);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l21n1);
            ruleTextView.setText(R.string.l21k1);
            exampleImage.setImageResource(R.drawable.klmap21);
        } else if (letter.equals(getString(R.string.letter22))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid22);
            letterImage.setImageResource(R.drawable.letter22);
            spelling.setText(R.string.letter22a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l22n);
            ruleTextView.setText(R.string.l22);
            exampleImage.setImageResource(R.drawable.klmap22);
        } else if (letter.equals(getString(R.string.letter23))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid23);
            letterImage.setImageResource(R.drawable.letter23);
            spelling.setText(R.string.letter23a);
            spellings.getChildAt(0).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(0)).setText(R.string.l23n3);
            spellings.getChildAt(1).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(1)).setText(R.string.l23n2);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l23n1);
            ruleTextView.setText(R.string.l23k1);
            exampleImage.setImageResource(R.drawable.klmap23);
        } else if (letter.equals(getString(R.string.letter24))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid24);
            letterImage.setImageResource(R.drawable.letter24);
            spelling.setText(R.string.letter24a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l24n);
            ruleTextView.setText(R.string.l24);
            exampleImage.setImageResource(R.drawable.klmap24);
        } else if (letter.equals(getString(R.string.letter25))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid25);
            letterImage.setImageResource(R.drawable.letter25);
            spelling.setText(R.string.letter25a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l25n);
            ruleTextView.setText(R.string.l25);
            exampleImage.setImageResource(R.drawable.klmap25);
        } else if (letter.equals(getString(R.string.letter26))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid26);
            letterImage.setImageResource(R.drawable.letter26);
            spelling.setText(R.string.letter26a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l26n);
            ruleTextView.setText(R.string.l26);
            exampleImage.setImageResource(R.drawable.klmap26);
        } else if (letter.equals(getString(R.string.letter27))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid27);
            letterImage.setImageResource(R.drawable.letter27);
            spelling.setText(R.string.letter27a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l27n);
            ruleTextView.setText(R.string.l27);
            exampleImage.setImageResource(R.drawable.klmap27);
        } else if (letter.equals(getString(R.string.letter28))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid28);
            letterImage.setImageResource(R.drawable.letter28);
            spelling.setText(R.string.letter28a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l28n);
            ruleTextView.setText(R.string.l28);
            exampleImage.setImageResource(R.drawable.klmap28);
        } else if (letter.equals(getString(R.string.letter29))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid29);
            letterImage.setImageResource(R.drawable.letter29);
            spelling.setText(R.string.letter29a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l29n);
            ruleTextView.setText(R.string.l29);
            exampleImage.setImageResource(R.drawable.klmap29);
        } else if (letter.equals(getString(R.string.letter30))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid30);
            letterImage.setImageResource(R.drawable.letter30);
            spelling.setText(R.string.letter30a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.VISIBLE);
            ((RadioButton) spellings.getChildAt(1)).setText(R.string.l30n2);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l30n1);
            ruleTextView.setText(R.string.l30k1);
            exampleImage.setImageResource(R.drawable.klmap30);
        } else if (letter.equals(getString(R.string.letter31))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid31);
            letterImage.setImageResource(R.drawable.letter31);
            spelling.setText(R.string.letter31a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l31n);
            ruleTextView.setText(R.string.l31);
            exampleImage.setImageResource(R.drawable.klmap31);
        } else if (letter.equals(getString(R.string.letter32))) {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid32);
            letterImage.setImageResource(R.drawable.letter32);
            spelling.setText(R.string.letter32a);
            spellings.getChildAt(0).setVisibility(View.GONE);
            spellings.getChildAt(1).setVisibility(View.GONE);
            ((RadioButton) spellings.getChildAt(2)).setText(R.string.l32n);
            ruleTextView.setText(R.string.l32);
            exampleImage.setImageResource(R.drawable.klmap32);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
