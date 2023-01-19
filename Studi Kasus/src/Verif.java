import Array.Array;
import Controller.Buku_Controller;
import Model.Model_Buku;
import Entity.entity_Buku;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.Entity;
import java.awt.*;
import java.util.ArrayList;


public class Verif extends MainFrame{
    private JButton btnCreateButton, btnUpdateButton, btnDeleteButton, exitButton;
    private JTextField namaBukuField, namaPeminjamField, hariPengambilanField, hariPengembalianField;
    private JLabel namaBukuLabel, namaPeminjamLabel, hariPengambilanLabel, hariPengembalianlabel;
    private JTable TampilTable;

    private JScrollPane scrollPane;



    public Verif(){
        super("MENU", 1200,700);
        setLocation(250,50);
        getContentPane().setBackground(Color.CYAN);
    }

    protected void component() {

        namaBukuLabel = new JLabel("NAMA BUKU");
        namaBukuLabel.setFont(new Font("Arial", Font.BOLD, 14));
        boundedAdd(namaBukuLabel,65,320,100,18);

        namaBukuField = new JTextField();
        boundedAdd(namaBukuField,65,340,250,30);

        namaPeminjamLabel = new JLabel("NAMA PEMINJAM");
        namaPeminjamLabel.setFont(new Font("Arial", Font.BOLD, 14));
        boundedAdd(namaPeminjamLabel,65,390,150,18);

        namaPeminjamField = new JTextField();
        boundedAdd(namaPeminjamField,65,410,250,30);

        hariPengambilanLabel = new JLabel("Hari PENGAMBILAN");
        hariPengambilanLabel.setFont(new Font("Arial", Font.BOLD, 14));
        boundedAdd(hariPengambilanLabel,65,460,150,18);

        hariPengambilanField = new JTextField();
        boundedAdd(hariPengambilanField,65,480,250,30);

        hariPengembalianlabel = new JLabel("HARI PENGEMBALIAN");
        hariPengembalianlabel.setFont(new Font("Arial", Font.BOLD, 14));
        boundedAdd(hariPengembalianlabel,65,530,150,18);

        hariPengembalianField = new JTextField();
        boundedAdd(hariPengembalianField,65,550,250,30);

        TampilTable = new JTable();
        TampilTable.setModel(createDataTable());
        TampilTable.setEnabled(false);
        TampilTable.getTableHeader().setReorderingAllowed(false);
        scrollPane = new JScrollPane(TampilTable);
        boundedAdd(scrollPane, 350, 72, 745, 440);

        btnCreateButton = new JButton("SAVE");
        btnCreateButton.setForeground(Color.white);
        btnCreateButton.setBackground(color("#2596be"));
        btnCreateButton.setFocusPainted(false);
        boundedAdd(btnCreateButton, 65, 600, 85, 30);

        btnUpdateButton = new JButton("EDIT");
        btnUpdateButton.setForeground(Color.white);
        btnUpdateButton.setBackground(color("#2596be"));
        btnUpdateButton.setFocusPainted(false);
        boundedAdd(btnUpdateButton, 165, 600, 85, 30);

        btnDeleteButton = new JButton("HAPUS");
        btnDeleteButton.setForeground(Color.white);
        btnDeleteButton.setBackground(color("#2596be"));
        btnDeleteButton.setFocusPainted(false);
        boundedAdd(btnDeleteButton, 265, 600, 85, 30);

        exitButton = new JButton("EXIT");
        exitButton.setForeground(Color.white);
        exitButton.setBackground(color("#2596be"));
        exitButton.setFocusPainted(false);
        boundedAdd(exitButton, 365, 600, 85, 30);

    }

    protected void event() {

        btnCreateButton.addActionListener((e) -> {
            try {
                String namaBuku = namaBukuField.getText();
                String namaPeminjam = namaPeminjamField.getText();
                String hariPeminjaman = hariPengambilanField.getText();
                String hariPengembalian = hariPengembalianField.getText();

                Buku_Controller buku = new Buku_Controller();
                buku.addBuku(namaBuku, namaPeminjam, hariPeminjaman, hariPengembalian);
                        JOptionPane.showMessageDialog(null,"BERHASIL DITAMBAHKAN","SUKSES", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new Verif().setVisible(true);
            } catch (Exception er) {
                JOptionPane.showMessageDialog(null,"MASUKAN HURUF YANG SESUAI","GAGAL",
                        JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new Verif().setVisible(false);
            }
        });

        btnUpdateButton.addActionListener((e)-> {
            try {
                String namaBuku = namaBukuField.getText();
                String namaPeminjam = namaPeminjamField.getText();
                String hariPeminjaman = hariPengambilanField.getText();
                String hariPengembalian = hariPengembalianField.getText();

                Buku_Controller buku = new Buku_Controller();
                int index = buku.editbuku(0, namaBuku, namaPeminjam, hariPeminjaman, hariPengembalian);
                if (index >= 0) {
                    buku.model_buku.editbuku(1, "");
                    JOptionPane.showMessageDialog(null, "Sukses Edit", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Verif().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan", "GAGAL", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Verif().setVisible(true);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Sesuaikan dengan Namanya", "GAGAL", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Verif().setVisible(true);
            }
        });

        exitButton.addActionListener((e)->{
            dispose();
            new Gui().setVisible(true);
        });
    }

    private DefaultTableModel createDataTable(){
        DefaultTableModel dataTable = new DefaultTableModel();
        Object column[] = {
                "NAMA BUKU",
                "NAMA PEMINJAM",
                "HARI PENGAMBILAN",
                "HARI PENGEMBALIAN",
        };
        dataTable.setColumnIdentifiers(column);

        ArrayList<entity_Buku> buku = Array.buku_entity;

            for (entity_Buku objek : buku){
                Object[] data = new String[]{
                        objek.getNamaBuku(),objek.getBorrow(), objek.getPinjam(), objek.getBack()
                };
            dataTable.addRow(data);
        }
        return dataTable;
    }

}


