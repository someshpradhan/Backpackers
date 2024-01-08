package com.saitaj.backpeackers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;
import com.saitaj.backpeackers.R;

public class CityDetails extends AppCompatActivity {

    ShapeableImageView mainimage, attr1img,attr2img, food1img, food2img;
    TextView city,description, duration,timetovisit,attr1name,attr1des,attr2name,attr2des,food1name,food1des,food2name,food2des;
    Button  locationbtn;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);
        mainimage = findViewById(R.id.citydetails_image);
        attr1img = findViewById(R.id.citydetails_place1image);
        attr2img = findViewById(R.id.citydetails_place2image);
        food1img = findViewById(R.id.citydetails_food1image);
        food2img = findViewById(R.id.citydetails_food2image);
        city = findViewById(R.id.citystate);
        description = findViewById(R.id.citydetails_description);
        duration = findViewById(R.id.citydetails_tripduration);
        timetovisit = findViewById(R.id.citydetails_besttime);
        attr1name = findViewById(R.id.citydetails_placee1name);
        attr2name = findViewById(R.id.citydetails_place2name);
        food1name = findViewById(R.id.citydetails_food1name);
        food2name = findViewById(R.id.citydetails_food2name);
        attr1des = findViewById(R.id.citydetails_place1description);
        attr2des = findViewById(R.id.citydetails_place2description);
        food1des = findViewById(R.id.citydetails_food1description);
        food2des = findViewById(R.id.citydetails_food2description);
        locationbtn = findViewById(R.id.citydetails_getlocationbtn);
        String city_str = getIntent().getStringExtra("putextra_city");
        int image_int = getIntent().getIntExtra("putextra_picture",0);

        if(city_str.equals("Agra")){
            city.setText("Agra, Uttar Pradesh");
            attr1name.setText("Taj Mahal");
            attr2name.setText("Agra Fort");
            attr1des.setText("The Taj Mahal is a mausoleum located in Agra, India, built by Mughal Emperor Shah Jahan in memory of his beloved wife Mumtaz Mahal.");
            attr2des.setText("Agra Fort is a historical fort in Agra, India, built by the Mughal emperor Akbar in the 16th century.");
            attr1img.setImageResource(R.drawable.agra);
            attr2img.setImageResource(R.drawable.agara_fort);
            food1name.setText("Agra Petha");
            food2name.setText("Bhalla");
            food1des.setText("Petha is a famous sweet from Agra, India made with white pumpkin, sugar syrup and often flavored with cardamom, saffron or rose water.");
            food2des.setText(" Bhalla is a popular street food in Agra, India made with fried lentil fritters topped with yogurt, chutneys and spices.");
            food1img.setImageResource(R.drawable.agra_petha);
            food2img.setImageResource(R.drawable.agara_bhalla);
            description.setText("A Very Popular city among tourists, Famous attarction of agra are Taj Mahal ,Agra Fort etc.");
            location = "https://www.google.com/maps/place/Agra,+Uttar+Pradesh/@27.1761503,77.8974397,12z/data=!3m1!4b1!4m6!3m5!1s0x39740d857c2f41d9:0x784aef38a9523b42!8m2!3d27.1766701!4d78.0080745!16zL20vMDF6eHg5";
             timetovisit.setText("October to March");
             duration.setText("2 to 3 Days");
            mainimage.setImageResource(R.drawable.agra);

        }
        if(city_str.equals("Amritsar")){
            city.setText("Amritsar, Punjab");
            attr1name.setText("Golden Temple");
            attr2name.setText("Jalaianwala Bagh");
            attr1des.setText("Shri Harmandir Sahib Golden Temple is a very popular Temple among the sikh community");
            attr2des.setText("public garden in Amritsar, India that became a site of tragedy in 1919 when British troops fired on unarmed civilians, killing hundreds. ");
            attr1img.setImageResource(R.drawable.goldentemple_amritsar);
            attr2img.setImageResource(R.drawable.jalaianwalabagh_amristar);
            food1name.setText("Aloo Paratha");
            food2name.setText("Sarson ka Saag");
            food1des.setText("Aloo Paratha is an Indian flatbread with spiced potato filling, commonly eaten with yogurt, pickles, or chutney.");
            food2des.setText("A very popular dish mainly eaten with makke ki roti.");
            food1img.setImageResource(R.drawable.amritsar_paratha);
            food2img.setImageResource(R.drawable.amritsar_sarson);
            description.setText(" Amritsar is a city in Punjab, India, known for its spiritual significance, rich history, and delicious Punjabi cuisine, including the famous Golden Temple.");
            location = "https://www.google.com/maps/place/Amritsar,+Punjab/@31.6335176,74.7875472,12z/data=!3m1!4b1!4m6!3m5!1s0x391964aa569e7355:0xeea2605bee84ef7d!8m2!3d31.6339793!4d74.8722642!16zL20vMDI5a3B5";
            timetovisit.setText("October to March");
            duration.setText("2 days");
            mainimage.setImageResource(R.drawable.amritsar);

        }
        if(city_str.equals("Darjeeling")){
            city.setText("Darjeeling, West Bengal");
            attr1name.setText("Tiger Hill Viewpoint");
            attr2name.setText("Darjeeling Himalayan Railway");
            attr1des.setText("Mesmerizing sunrise view from the Himalayas at Tiger Hill.");
            attr2des.setText("The Darjeeling Himalayan Railway is a Site famous for its scenic toy train rides in Darjeeling.");
            attr1img.setImageResource(R.drawable.tigerhill_darjeeling);
            attr2img.setImageResource(R.drawable.himalyarailway_darjeeling);
            food1name.setText("Momos");
            food2name.setText("Thupka");
            food1des.setText("Darjeeling momos are a type of steamed dumplings filled with vegetables, meat or cheese");
            food2des.setText("Darjeeling Thukpa is a Tibetan noodle soup dish made with vegetables, meat or seafood, and a flavorful broth");
            food1img.setImageResource(R.drawable.momos_darjeeling);
            food2img.setImageResource(R.drawable.soup_darjeeling);
            description.setText("Darjeeling is a town in the Indian state of West Bengal known for its tea industry and stunning views of the Himalayas.");
            location = "https://www.google.com/maps/place/Darjeeling,+West+Bengal/@27.0331889,88.2233895,13z/data=!3m1!4b1!4m6!3m5!1s0x39e42e654cf501bb:0x4175555979d4702a!8m2!3d27.0410218!4d88.2662745!16zL20vMDE5amxx";
            timetovisit.setText("October to May");
            duration.setText("3 days");
            mainimage.setImageResource(R.drawable.darjeleling);

        }
        if(city_str.equals("Kolkata")){
            city.setText("Kolkata, West Bengal");
            attr1name.setText("Howrah Bridge");
            attr2name.setText("Victoria Memorial");
            attr1des.setText("Howrah Bridge: Iconic cantilever bridge, spans Hooghly River, Kolkata.");
            attr2des.setText("Victoria Memorial: Marble palace and museum, dedicated to Queen Victoria, Kolkata.");
            attr1img.setImageResource(R.drawable.howrah_kolkata);
            attr2img.setImageResource(R.drawable.victoriamemo_kolkata);
            food1name.setText("Rosogolla");
            food2name.setText("Mishti Doi");
            food1des.setText("Rosogolla: Iconic spongy dessert, made from cottage cheese and syrup, originating in Kolkata.");
            food2des.setText(" Sweet yogurt dessert from Kolkata, made by fermented sweet milk and yogurt culture.");
            food1img.setImageResource(R.drawable.rosogolla_kolkata);
            food2img.setImageResource(R.drawable.mistidoi_kolkata);
            description.setText("Vibrant city in eastern India, known for colonial architecture, cultural diversity, and delicious food.");
            location = "https://www.google.com/maps/place/Kolkata,+West+Bengal/@22.5354063,88.2647793,12z/data=!3m1!4b1!4m6!3m5!1s0x39f882db4908f667:0x43e330e68f6c2cbc!8m2!3d22.572646!4d88.363895!16zL20vMGN2dzk";
            timetovisit.setText("April to June");
            duration.setText(" 2 days.");
            mainimage.setImageResource(R.drawable.kolkata);

        } if(city_str.equals("Jaipur")){
            city.setText("Jaipur, Rajasthan");
            attr1name.setText("Hawa Mahal");
            attr2name.setText("Raj Mandir Theatre");
            attr1des.setText("Hawa Mahal: Pink sandstone palace, intricate latticework, honeycomb design, Jaipur.");
            attr2des.setText("Raj Mandir Cinema is a famous and opulent movie theater in Jaipur, known for its stunning architecture and grand movie experience.");
            attr1img.setImageResource(R.drawable.jaipur);
            attr2img.setImageResource(R.drawable.jaipur_rajmandir);
            food1name.setText("Daal Batti churma");
            food2name.setText("Pyaaz Kachori");
            food1des.setText("Daal Batti Churma: Rajasthani dish of lentils, wheat balls, and sweet dessert.");
            food2des.setText("Pyaaz Kachori: Popular Rajasthani snack, crispy pastry shell, spiced onion-potato filling.");
            food1img.setImageResource(R.drawable.jaipur_dalbatti);
            food2img.setImageResource(R.drawable.jaiour_kachori);
            description.setText("Jaipur is a vibrant and historic city in Rajasthan, known for its beautiful palaces, colorful bazaars, and rich cultural heritage.");
            location = "https://www.google.com/maps/place/Jaipur,+Rajasthan/@26.8851147,75.6254029,11z/data=!3m1!4b1!4m6!3m5!1s0x396c4adf4c57e281:0xce1c63a0cf22e09!8m2!3d26.9124336!4d75.7872709!16zL20vMDE2NzIy";
            timetovisit.setText(" November to February");
            duration.setText(" 2 to 3 days.");
            mainimage.setImageResource(R.drawable.jaipur);

        }
        if(city_str.equals("Udaipur")){
            city.setText("Udaipur, Rajasthan");
            attr1name.setText("City Palace");
            attr2name.setText("Lake Pichola");
            attr1des.setText("Udaipur palace complex with impressive architecture, gardens, and lake views.");
            attr2des.setText("Lake Pichola: Scenic man-made lake in Udaipur, Rajasthan.");
            attr1img.setImageResource(R.drawable.citypalace_udaipur);
            attr2img.setImageResource(R.drawable.lakepichola_udaipur);
            food1name.setText("Gatte ki Sabzi");
            food2name.setText("Ker Sangri");
            food1des.setText(" Rajasthani dish with besan dumplings in yogurt gravy, served with rice or roti.");
            food2des.setText(" Rajasthani dish with dried berries & beans, cooked with spices, served with roti or rice.");
            food1img.setImageResource(R.drawable.gattesabzi_udiapur);
            food2img.setImageResource(R.drawable.sengri_udaipur);
            description.setText("Picturesque city in Rajasthan known for lakes, palaces, and gardens.");
            location = "https://www.google.com/maps/place/Udaipur,+Rajasthan/@24.6082637,73.6222987,12z/data=!3m1!4b1!4m6!3m5!1s0x3967e56550a14411:0xdbd8c28455b868b0!8m2!3d24.585445!4d73.712479!16zL20vMGJfa2Z5";
            timetovisit.setText(" October to March ");
            duration.setText(" 2 to 3 days.");
            mainimage.setImageResource(R.drawable.udaipur);

        }







        locationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location)));
            }
        });










    }
}