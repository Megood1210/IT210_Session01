/*
1. Phân tích Vấn đề (Problem Analysis)
Hệ thống cần tích hợp EmailSender và SmsSender vào NotificationService. Nhiệm vụ là lựa chọn phương thức tiêm phụ thuộc tối ưu nhất trong 3 cách: Constructor, Field, và Setter Injection để đảm bảo tính ổn định và dễ bảo trì.

2. Bảng so sánh các giải pháp Dependency Injection
Dưới đây là bảng so sánh chi tiết giữa hai giải pháp phổ biến nhất để đưa ra quyết định thiết kế:


Tiêu chí                 |Constructor Injection	   |Field Injection
Tính rõ ràng dependency  |Rõ ràng (qua constructor)|Ẩn, khó nhìn
Test (Unit Test)	     |Dễ mock	               | Khó test
Bất biến (immutability)  |Có thể dùng final	       |Không
Phát hiện lỗi sớm	     |Lỗi ngay khi khởi tạo	   | Lỗi runtime
Loose Coupling	         |Tốt	                   |Trung bình
Xử lý optional dependency|Không linh hoạt	       |Linh hoạt hơn

Giải pháp thiết kế:

Cơ chế Retry (Thử lại): Thiết lập logic tự động gửi lại (ví dụ: tối đa 3 lần) với khoảng trễ tăng dần để đối phó với sự cố mạng tạm thời.
Xử lý Exception: Sử dụng try-catch để bao bọc tiến trình gửi. Nếu thất bại hoàn toàn, hệ thống phải ghi Log lỗi chi tiết và lưu trạng thái "Chờ gửi lại" (Pending) vào cơ sở dữ liệu.
Dự phòng (Fallback): Nếu kênh SMS lỗi kéo dài, hệ thống có thể tự động chuyển hướng thông báo quan trọng qua kênh Email làm dự phòng.
4. Chốt lựa chọn giải pháp
Giải pháp lựa chọn: Constructor Injection

Lý do:

Độ tin cậy: Đảm bảo NotificationService luôn ở trạng thái sẵn sàng và hợp lệ ngay sau khi được tạo ra.
Dễ bảo trì: Giúp mã nguồn sạch hơn, tuân thủ nguyên tắc lập trình hướng đối tượng (OOP) và dễ dàng viết Unit Test để giả lập các tình huống lỗi mạng SMS (bẫy dữ liệu).
An toàn: Tránh được các lỗi tiềm ẩn liên quan đến việc thiếu phụ thuộc khi ứng dụng vận hành.
 */