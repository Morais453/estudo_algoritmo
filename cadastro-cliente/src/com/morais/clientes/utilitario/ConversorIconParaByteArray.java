package com.morais.clientes.utilitario;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ConversorIconParaByteArray {
    public static byte[] converter(Icon icon) {
        if (icon == null) {
            return null;
        }

        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = bufferedImage.createGraphics();

        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            ImageIO.write(bufferedImage, "png", baos);
        } catch (IOException e) {
            System.out.println("Erro ao converter imagem: " + e.getMessage());
            return null;
        }

        return baos.toByteArray();
    }
}
