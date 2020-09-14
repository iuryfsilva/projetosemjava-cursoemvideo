/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exerciciosresolvidosDeitel;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Iury Silva
 */
public class DrawPanel extends JPanel{
    @Override
    public void paintComponent(Graphics grafico){//construtor dessa classe
        super.paintComponent(grafico);
        
        int largura = getWidth();
        int altura = getHeight();
        
        
         /**
     * Draws a line, using the current color, between the points
     * <code>(x1,&nbsp;y1)</code> and <code>(x2,&nbsp;y2)</code>
     * in this graphics context's coordinate system.
     * @param   x1  the first point's <i>x</i> coordinate.
     * @param   y1  the first point's <i>y</i> coordinate.
     * @param   x2  the second point's <i>x</i> coordinate.
     * @param   y2  the second point's <i>y</i> coordinate.
     * public abstract void drawLine(int x1, int y1, int x2, int y2);
     */
        //desenha uma linha a partir do canto superior esquerdo ate o inferior direito
        for(int controleY = 0; controleY < altura; controleY += 30){
            int controleX;
            for(controleX = 0;controleX < controleY; controleX += 30){
                //altura = controleX;
                //largura = controleY;
                grafico.drawLine(0,0, altura/2, controleX);
                grafico.drawLine(largura,0, largura/2, controleY/2);
                grafico.drawLine(0,altura, controleX/2, altura/2);
                //grafico.drawLine(largura,altura, largura/2, controleY/2);
            }
            grafico.drawLine(0,0, altura/2 , controleY/2);
            grafico.drawLine(largura,0, largura/2, controleY/2);
            grafico.drawLine(0,altura, controleX/2, altura/2);
            //grafico.drawLine(largura,altura, largura/2, controleY/2);
        }
        /*
        for(int controleY = 0; controleY < altura; controleY += 15){
            grafico.drawLine(0, controleY, largura, altura);
        }
        for(int controleX = 0; controleX < altura; controleX += 15){
            grafico.drawLine(controleX, altura, largura, 0);
        }
        
        //desenha uma linha a partir docanto inferioresquerdo ate o superior direito
        for(int controleX = 0; controleX < altura; controleX += 15){
            grafico.drawLine(altura, controleX, largura, 0);
        }
*/
        
        
        
    }
}

