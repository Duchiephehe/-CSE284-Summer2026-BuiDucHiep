# Sơ Đồ Lớp (Class Diagram) - Quản Lý Cửa Hàng Hoa Quả

```text
      +-----------------------------------------+
      |                Customer                 |
      +-----------------------------------------+
      | - maKhachHang: String                   |
      | - tenKhachHang: String                  |
      | - soDienThoai: String                   |
      +-----------------------------------------+
      | + getMaKhachHang(): String              |
      | + setMaKhachHang(ma: String): void      |
      | + getTenKhachHang(): String             |
      | + setTenKhachHang(ten: String): void    |
      | + getSoDienThoai(): String              |
      | + setSoDienThoai(sdt: String): void     |
      | + nhapThongTin(): void                  |
      | + xuatThongTin(): void                  |
      +-----------------------------------------+
                           |
                           | 1
                           |
                           | Đặt hàng
                           |
                           v *
      +-----------------------------------------+
      |                  Order                  |
      +-----------------------------------------+
      | - maDonHang: String                     |
      | - ngayTao: String                       |
      | - tongTien: Double                      |
      +-----------------------------------------+
      | + getMaDonHang(): String                |
      | + setMaDonHang(ma: String): void        |
      | + getNgayTao(): String                  |
      | + setNgayTao(ngay: String): void        |
      | + getTongTien(): Double                 |
      | + setTongTien(tong: Double): void       |
      | + nhapThongTin(): void                  |
      | + xuatThongTin(): void                  |
      +-----------------------------------------+
                           |
                           | *
                           |
                           | Gồm có
                           |
                           v *
      +-----------------------------------------+
      |                  Fruit                  |
      +-----------------------------------------+
      | - maHoaQua: String                      |
      | - tenHoaQua: String                     |
      | - giaBan: Double                        |
      | - soLuong: Integer                      |
      +-----------------------------------------+
      | + getMaHoaQua(): String                 |
      | + setMaHoaQua(ma: String): void         |
      | + getTenHoaQua(): String                |
      | + setTenHoaQua(ten: String): void       |
      | + getGiaBan(): Double                   |
      | + setGiaBan(gia: Double): void          |
      | + getSoLuong(): Integer                 |
      | + setSoLuong(sl: Integer): void         |
      | + nhapThongTin(): void                  |
      | + xuatThongTin(): void                  |
      +-----------------------------------------+
```
