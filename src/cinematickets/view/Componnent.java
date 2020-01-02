package cinematickets.view;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author yogi-06926
 */
public class Componnent extends JFrame{
     JButton anyar = new JButton();
    JTable list;
    JScrollPane scroll = new JScrollPane(); 
    JButton masuk = new JButton("Hapus");
    JButton keluar = new JButton("<- Back");
    JButton logOut = new JButton("Log Out");
    JCheckBox jcMotor = new JCheckBox();
    JCheckBox jcMobil = new JCheckBox();
    JCheckBox jcKarcis = new JCheckBox();
    JCheckBox jcStnk = new JCheckBox();
    String[] Kolom = {"Plat","Tanggal","Jam Masuk","Jam Keluar","Bayar"};
    JLabel judulHasilTanggal = new JLabel("Tanggal");
    JLabel judulHasilJamIn = new JLabel("Jam Masuk");
    JLabel judulHasilJamOut = new JLabel("Jam Keluar");
    JLabel judulHasilBayar = new JLabel("Bayar");
    JPanel myPane = new JPanel();
    JPanel myPane2 = new JPanel();     

    JLabel judulHasilPlat = new JLabel("Plat");
    JLabel lblPlat = new JLabel("Nomor Plat    :");
    JLabel judul1 = new JLabel("PT. Go Clean Indonesia");
    JLabel judul2= new JLabel("Parking System");
    JLabel logo= new JLabel();
    ImageIcon icon=new ImageIcon("/home/yogi-06926/Praktium/modul4/dosen/06926-m4PraktikumDosen/src/m4PraktikumDosen/View/logo-company-139-1517906246.jpg");
    JLabel lblIn = new JLabel("Jam Masuk    :");
    JLabel lblOut = new JLabel  ("Jam Keluar    :");
    JLabel lblHarga = new JLabel("Tarif              : ");
    JLabel lblDenda = new JLabel("Tidak Ada Stnk: ");
    JLabel lblDenda1 = new JLabel("Karcis Hilang   : ");
    JPasswordField password = new JPasswordField();
    JTextField jtPlat = new JTextField();
    JTextField jtHarga = new JTextField();
    JTextField jtIn = new JTextField();
    JTextField jtOut = new JTextField();
    JLabel lblDendaa = new JLabel("...");//lblDendaa yang aku rubah
    JLabel lblDenda11 = new JLabel();
    JButton bayar= new JButton("Bayar");
    JButton admin = new JButton("ADMINISTRATOR");
    JButton Submit = new JButton("SUBMIT");
    // untuk memanggil gambar
    public static BufferedImage ambilGambar(String ref){
        BufferedImage bimg=null;
        try {
            bimg = ImageIO.read(new File(ref));
        }catch (Exception e){
            e.printStackTrace();
        }
        return bimg;
    }
    //untuk rezize gambar
    public static BufferedImage resize(BufferedImage img,int newW, int newH){
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage dimg= dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g = dimg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0,newW, newH,0,0,w,h,null);
        g.dispose();
        return dimg;
    } 
    //combinasi with jlbel
    public void tampil(String url1){
        String url = url1;
        BufferedImage ambilgmbr = ambilGambar(url);
        ImageIcon imageIcon = new ImageIcon(resize(ambilgmbr,logo.getWidth(),logo.getHeight()));
        logo.setIcon(imageIcon);
    }
}
