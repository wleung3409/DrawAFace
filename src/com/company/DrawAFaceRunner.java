package com.company;

    public class DrawAFaceRunner{
        public static void main(String[]args){
            String[][]template = new String[][]{
                    {" ","0","0","0","0","0","0","0","0","0"," "},
                    {" ","0","0","0","0","0","0","0","0","0"," "},
                    {" ","0","0","0","0","0","0","0","0","0"," "},
                    {" ","0","0","0","0","0","0","0","0","0"," "},
                    {" ","0","0","0","0","0","0","0","0","0"," "},
                    {" ","0","0","0","0","0","0","0","0","0"," "},


            };
            FaceDrawing Face = new FaceDrawing(template);

            System.out.println(Face.toString());

            Face.fill("0");

            System.out.println(Face.toString());

            Face.edit("^",1,2);
            Face.edit("^",1,8);
            Face.edit("~",3,2);
            Face.edit("~",3,3);
            Face.edit("~",3,4);
            Face.edit("~",3,5);
            Face.edit("~",3,6);
            Face.edit("~",3,7);
            Face.edit("~",3,8);
            Face.edit("~",3,8);

            System.out.println(Face.toString());

    }
}
