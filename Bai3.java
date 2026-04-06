package Bai3;

//1. Phân tích Dữ liệu
//- Input : userId (ID người chơi), foodItemId (Mã món ăn), quantity (Số lượng)
//- Output :
//        - Thành công: Trừ tiền tài khoản, trừ kho, thông báo "Mì xào bò đang được chế biến"
//        - Thất bại: Thông báo lỗi cụ thể (Hết món hoặc Số dư không đủ)
//2. Thiết kế Giải pháp
//- Các bước xử lý logic:
//        - Tiếp nhận: Nhận thông tin đơn hàng từ Client
//  - Kiểm tra tồn kho : Gọi InventoryRepository để kiểm tra món ăn còn đủ số lượng không
//  - Nếu số lượng = 0: Ném lỗi
//  - Kiểm tra tài khoản : Lấy số dư và so sánh với giá tiền đơn hàng
//  - Nếu số dư < tổng tiền: Ném lỗi
//  - Thực thi giao dịch : Trừ số lượng trong kho
//  - Trừ tiền tài khoản
//  - Phản hồi: Trả về kết quả thành công cho khách hàng
