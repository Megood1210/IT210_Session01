package Bai1;

//Đoạn code sai:
//public RechargeService() {
//    // Lỗi: Tự khởi tạo thủ công (Hard-code dependency)
//    this.gateway = new InternalPaymentGateway();
//}
//Cách viết này làm mất đi khả năng linh hoạt của ứng dụng vì class tự quản lý dependency của mình, dẫn đến
//tight coupling, khó mở rộng và không thể dễ dàng thay đổi