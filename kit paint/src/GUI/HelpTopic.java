/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author user
 */
public class HelpTopic extends javax.swing.JFrame {

    /**
     * Creates new form HelpTopic
     */
    public HelpTopic() {
        initComponents();
        this.setTitle("User Manual");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("******************************Kit Paint*******************************\nFeatures---\n\n1. Free Hand Drawing\n2. Text editor\n3. Basic Shapes:\n      Line Drawing\n      Rectangle Drawing\n      Oval Drawing\n      Rounded Rectangle Drawing\n      Polygon Drawing\n      Arc drawing\n4. Editing \n    Erase\n    Clear Canvas\n\n5. Color Options:\n    Foreground Color setting\n    Background Color setting\n    Fill Color\n6. Saving Options:\n     Saving Drawn Image\n     Opening any formatted Image\n\n7. Cursor Position\n8. Grid view\n\n***********************************************************************\n\nFUNCTIONS---\n\n----About short-cut key----\n\nCtrl + 'N'- open a new window to draw\nCtrl + 'O'- open any image in any kind of format can be opened  \nCtrl + 'S'- save picture in directory\nCtrl + '0'<zero>- exit from the program\n\n----About drawing----\n\ni.   \"Pencil\" to draw hand drawing of any type of shape.\nii.  \"Brush\" to like pencil but more weighted.\niii. \"Eraser\" to erase certain part of object\niv.  \"Clear\" to clear all from the canvas.\nv.   \"Text\" to use plain english on canvas.\nvi.  \"Grid\" to use grid view from \"color\" tab.\n\n----About color----\n\nYou can choice color from \"color\" tab as \"Background\" and \"Foreground\".\n\n----About Shape----\n\nYou can draw \n      1. Straight Line \n      2. Rectangle \n      3. Oval\n      4. Rounded Rectangle \n      5. Polygon\n      6. Arc\nYou have to press the mouse button to select the point where you want to draw it.\nYou can also use the \"dot\" or \"fill\" format to draw.\n\n-----About Text editor----\n\nSelect the \"Text\" button first and then you get the option -\n     1. what do you want to write...\n     2. what type of font do you use...\n     3. what size of font do you use...\n     4. what format do you use...\nThen you select \"OK\"/\"Cancel\" button and any point of the canvas to draw it at this point.\n\n*********************************************************************\n\nFor any type of query or technical help , can contact with the authors.\n\nAuthors:\n1. Md. Touhidul Alam Tapos (tapos12.hotmail.com)\n2. Md. Hamjajul Ashmafee (ashmafee@gmail.com)\n3. Md. Hasib Hasan ()\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
