package SwiftMath.Project.GUI.System.AppSystem;

import SwiftMath.Project.Resources.UI.Assets.Components.AppColors;
import SwiftMath.Project.Resources.UI.Theme.ThemeWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/17/2021 in 8:53 AM
 */
public class FrameSystem extends JFrame implements ActionListener {

    public JMenuBar jMenuBar;
    public JMenu File, preferencesMenu;
    public JMenuItem Options;
    public JMenuItem exitMenuItem;
    public JMenuItem changeThemeItem;
    public JMenuItem Contact;
    public JMenuItem Version;
    public JMenu Help;
    public JMenu Info;
    public JMenu changeTheme;

    public FrameSystem() {

        jMenuBar = new JMenuBar();
        File = new JMenu("File");
        preferencesMenu = new JMenu("Preferences");
        Options = new JMenu("Options");

        jMenuBar.add(File);
        jMenuBar.add(preferencesMenu);

        File.add(Options);

        exitMenuItem = new JMenuItem("Exit", new ImageIcon("src/SwiftMath/Project/Resources/UI/Assets/Images/EXIT_IMAGE_ICON-removebg-preview.png"));
        exitMenuItem.addActionListener(this);
        Options.add(exitMenuItem);

        changeTheme = new JMenu("UI Options");
        preferencesMenu.add(changeTheme);

        changeThemeItem = new JMenuItem("Change UI Theme", new ImageIcon("src/SwiftMath/Project/Resources/UI/Assets/Images/UITheme-removebg-preview.png"));
        changeThemeItem.addActionListener(this);
        changeTheme.add(changeThemeItem);

        Help = new JMenu("Help");
        jMenuBar.add(Help);

        Contact = new JMenuItem("App Info", new ImageIcon("src/SwiftMath/Project/Resources/UI/Assets/Images/contact-removebg-preview.png"));
        Contact.addActionListener(this);
        Help.add(Contact);

        Info = new JMenu("Other Info");
        Help.add(Info);

        Version = new JMenuItem("Version", new ImageIcon("src/SwiftMath/Project/Resources/UI/Assets/Images/Vers_Info-removebg-preview.png"));
        Info.add(Version);

        ImageIcon img = new ImageIcon("src/SwiftMath/Project/Resources/UI/Assets/Images/GeoMathImage.jpg");
        this.setIconImage(img.getImage());
        this.setSize(1542,828);
        this.setTitle("SwiftMath 2D"); // working Title
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(AppColors.FRAME_WHITE);
        this.setJMenuBar(jMenuBar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitMenuItem) {
            Toolkit.getDefaultToolkit().beep();
            if (JOptionPane.showConfirmDialog(exitMenuItem, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                System.exit(0);
            }
        }

        if(e.getSource() == changeThemeItem) {
            ThemeWindow themeWindow = new ThemeWindow();
            themeWindow.setDefaultCloseOperation(HIDE_ON_CLOSE);
        }
    }
    //Paint methods

}
