package com.morais.clientes.utilitario;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

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
    }
}
