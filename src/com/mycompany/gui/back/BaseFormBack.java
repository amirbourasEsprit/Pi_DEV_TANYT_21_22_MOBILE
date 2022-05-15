/*
 * Copyright (c) 2016, Codename One
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions 
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */
package com.mycompany.gui.back;

import com.mycompany.gui.*;
import com.codename1.components.ScaleImageLabel;
import com.codename1.io.Preferences;
import com.codename1.io.Storage;
import com.codename1.ui.Component;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.layouts.Layout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.util.Resources;
 

/**
 * Base class for the forms with common functionality
 *
 * @author Shai Almog
 */
public class BaseFormBack extends Form {
int w=1;

    public BaseFormBack() {
    }

    public BaseFormBack(Layout contentPaneLayout) {
        super(contentPaneLayout);
    }

    public BaseFormBack(String title, Layout contentPaneLayout) {
        super(title, contentPaneLayout);
    }

    public Component createLineSeparator() {
        Label separator = new Label("", "WhiteSeparator");
        separator.setShowEvenIfBlank(true);
        return separator;
    }

    public Component createLineSeparator(int color) {
        Label separator = new Label("", "WhiteSeparator");
        separator.getUnselectedStyle().setBgColor(color);
        separator.getUnselectedStyle().setBgTransparency(255);
        separator.setShowEvenIfBlank(true);
        return separator;
    }

    protected void addSideMenu(Resources res) {
        Toolbar tb = getToolbar();
       /* Image img = res.getImage("profile-background.jpg");
        if (img.getHeight() > Display.getInstance().getDisplayHeight() / 3) {
            img = img.scaledHeight(Display.getInstance().getDisplayHeight() / 3);
        }*/
        //ScaleImageLabel sl = new ScaleImageLabel(img);
     /*   sl.setUIID("BottomPad");
        sl.setBackgroundType(Style.BACKGROUND_IMAGE_SCALED_FILL);

        tb.addComponentToSideMenu(LayeredLayout.encloseIn(
                sl,
                FlowLayout.encloseCenterBottom(
                        new Label(res.getImage("profile-pic.jpg"), "PictureWhiteBackgrond"))
        ));*/
     /*   tb.addMaterialCommandToSideMenu("Profile", FontImage.MATERIAL_SETTINGS, e -> new ProfileFormBack(res).show());
        tb.addMaterialCommandToSideMenu("Users", FontImage.MATERIAL_ACCOUNT_BOX, e -> new UserFormBack(res).show());
        tb.addMaterialCommandToSideMenu("Cartes", FontImage.MATERIAL_ACCOUNT_BOX, e -> new CarteFormBack(res).show());*/
         tb.addMaterialCommandToSideMenu("Event", FontImage.MATERIAL_SETTINGS, e ->  new MainUI(res).show());
                  //  tb.addMaterialCommandToSideMenu("Camping", FontImage.MATERIAL_SETTINGS, e ->  new AllCampings("Camping",res).show());
                
                // new EventFormBack(res).show());
         
         //   tb.addMaterialCommandToSideMenu("Statistiques", FontImage.MATERIAL_EXIT_TO_APP, e -> new StatFormBack(res).show());
         //   tb.addMaterialCommandToSideMenu("Commandes Back", FontImage.MATERIAL_UPDATE, e -> new CommandeFormBack(res).show());
        
       // tb.addMaterialCommandToSideMenu("Produits Back", FontImage.MATERIAL_EXIT_TO_APP, e -> new ProduitFormBack(res).show());
        tb.addMaterialCommandToSideMenu("Logout", FontImage.MATERIAL_EXIT_TO_APP, e -> {
            
        }
        );
        refreshTheme();
    }
}
