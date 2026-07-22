
## 1. Sơ đồ dạng Text (ASCII Art)

```text
       +-----------------------------------------+
       |             <<interface>>               |
       |               IThongTin                 |
       +-----------------------------------------+
       | + nhapThongTin(): void                  |
       | + xuatThongTin(): void                  |
       +-----------------------------------------+
             ^             ^             ^
             |             |             | implements
             |             |             |
      +------+      +------+      +------+
      |             |             |
+-----------------------------------------+
|                Customer                 |
+-----------------------------------------+
| - maKhachHang: String                   |
| - tenKhachHang: String                  |
| - soDienThoai: String                   |
| - danhSachDonHang: List<Order>          |
+-----------------------------------------+
| + get/set methods...                    |
| + themDonHang(order: Order): void       |
| + nhapThongTin(): void                  |
| + xuatThongTin(): void                  |
+-----------------------------------------+
                     |
                     | 1
                     |
                     | Đặt hàng (danhSachDonHang)
                     |
                     v *
+-----------------------------------------+
|                  Order                  |
+-----------------------------------------+
| - maDonHang: String                     |
| - ngayTao: String                       |
| - tongTien: Double                      |
| - danhSachHoaQua: List<Fruit>           |
+-----------------------------------------+
| + get/set methods...                    |
| + themHoaQua(fruit: Fruit): void        |
| + nhapThongTin(): void                  |
| + xuatThongTin(): void                  |
+-----------------------------------------+
                     |
                     | 1
                     |
                     | Gồm có (danhSachHoaQua)
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
| + get/set methods...                    |
| + nhapThongTin(): void                  |
| + xuatThongTin(): void                  |
+-----------------------------------------+
```
