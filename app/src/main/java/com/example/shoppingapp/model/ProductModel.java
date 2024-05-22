package com.example.shoppingapp.model;

import android.widget.RatingBar;

public class ProductModel {

    public int modelImage;
    public String modelNames;
    public String modelPrice;
    public String modelOriginal;

    public String modelDescription;
    public String modelColor;
    //public float ModelRating;

    public ProductModel(int modelImage,String modelNames,String modelOriginal,String modelNumber,String modelDescription,String modelColor)
    {
        this.modelImage=modelImage;
        this.modelNames=modelNames;
        this.modelOriginal=modelOriginal;
        this.modelPrice=modelNumber;
        this.modelDescription=modelDescription;
        this.modelColor=modelColor;
        //this.ModelRating=ModelRating;
    }

}
