package Bai2;

//Một Bean mặc định trong Spring (Singleton) lại gây ra hiện tượng tính nhầm tiền trên vì nó mặc định tạo Bean
//theo scope Singleton, nên chỉ tồn tại một instance duy nhất của PlaySession nhưng tất cả các máy trạm đều sử
//dụng chung instance này, dẫn đến việc biến playTime bị chia sẻ và cập nhật chung, gây ra hiện tượng tính nhầm
//tiền giữa các máy.