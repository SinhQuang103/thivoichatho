package Thi;

import BTcanbo.QLCB;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Database> list = new ArrayList<>();
        while (true) {
            System.out.println("---- Chuong Trinh Quan Ly SP ----" +
                    "Chon chuc nang theo so" +
                    "\n1. Xem danh sach" +
                    "\n2. Them moi" +
                    "\n3. Cap nhat" +
                    "\n4. Xoa" +
                    "\n5. Sap xep" +
                    "\n6. Tim kiem SP dat nhat" +
                    "\n7. Doc tu file" +
                    "\n8. Ghi vao file" +
                    "\n9. Thoat");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 9 ) {
                break;
            }
            if (choice == 1) {
                System.out.println("----Danh Sach SP----");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
            if (choice == 2) {
                System.out.println("Nhap ma SP");
                int maSP = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap ten SP");
                String tenSP = scanner.nextLine();
                System.out.println("Nhap gia");
                int gia = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap so luong");
                int soluong = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap mo ta SP");
                String mota = scanner.nextLine();
                list.add(new Database(maSP,tenSP,gia,soluong,mota));
            }
            if (choice == 3) {
                System.out.println("Nhap ma SP can sua");
                int maSP = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap ten SP moi");
                String tenSP = scanner.nextLine();
                System.out.println("Nhap gia moi");
                int gia = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap so luong moi");
                int soluong = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap mo ta SP moi");
                String mota = scanner.nextLine();
                for (Database db : list) {
                    if (maSP == db.getMaSP()) {
                        db.setTenSP(tenSP);
                        db.setGia(gia);
                        db.setSoluong(soluong);
                        db.setMota(mota);
                    }
                }
            }
            if (choice == 4) {
                System.out.println("Nhap ma SP  can xoa");
                int maSP = Integer.parseInt(scanner.nextLine());
                Database toRemove = null;
                for (Database db : list) {
                    if (maSP == db.getMaSP()) {
                        toRemove = db;
                    }
                }
                if (toRemove != null) {
                    list.remove(toRemove);
                }
            }
            if (choice == 5) {
                System.out.println("----Sap Xep-----" +
                        "\n1. Tu cao den thap" +
                        "\n2 Tu thap den cao");
                int choice1 = scanner.nextInt();
                if (choice1 == 1){
                    for (int i = 0; i < list.size()-1; i++) {
                        for (int j = 0; j < list.size() - i - 1; j++) {
                            if (list.get(j).getGia() < list.get(j + 1).getGia()) {
                                Database temp = list.get(j);
                                list.set(j,list.get(j+1));
                                list.set(j+1,temp);
                                }
                            }
                        }
                    }
                System.out.println(list);

                if (choice1 == 2 ) {
                    for (int i = 0; i < list.size() - 1; i++) {
                        for (int j = 0; j < list.size() - i - 1; j++) {
                            if (list.get(j).getGia() > list.get(j + 1).getGia()) {
                                Database temp = list.get(j);
                                list.set(j,list.get(j+1));
                                list.set(j+1,temp);
                            }
                        }
                    }
                }
                System.out.println(list);
            }
            if (choice == 6) {
                Database giacaonhat = null;
                for (Database db : list) {
                    if (giacaonhat == null || db.getGia() > giacaonhat.getGia()) {
                        giacaonhat = db;
                    }
            }
                if (giacaonhat != null) {
                    System.out.println("Ma SP:" + giacaonhat.getMaSP());
                    System.out.println("Ten SP: " + giacaonhat.getTenSP());
                    System.out.println("Gia: " + giacaonhat.getGia());
                    System.out.println("So luong: " + giacaonhat.getSoluong());
                    System.out.println("Mo ta: " + giacaonhat.getMota());
                } else {
                    System.out.println("khong ton tai");
                }
            }
        }
    }
}
