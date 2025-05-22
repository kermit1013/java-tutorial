package org.example;

public class PasswordValidation {

    /// 最基本的
    /// 信箱空白、密碼空白 v
    /// 信箱與密碼的長度限制 (沒處理的話，會有 buffer overflow 的問題) v
    /// 信箱格式驗證錯誤 v
    /// 密碼安全性不足 v
    /// 輸入框清理 (沒做的話，可能被 XSS 或 SQL injection 攻擊) v
    /// 更進階的
    ///
    /// 如果信箱已經被註冊，要如何處理  (直接說「該信箱已被註冊」會有資安疑慮)
    /// 如果客戶端呼叫 API 失敗了，有沒有重試機制?
    /// 加上限流 (避免被攻擊大量註冊)
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("請輸入密碼: ");
        if (scanner.hasNext()) {
            String pwd = scanner.next().trim();
            //密碼的長度限制
            if (pwd.length() > 20 || pwd.length() < 3) {
                throw new LengthException("自定義：長度限制不符");
            }
            // 密碼的格式驗證 必須有大小寫英文(最小程度使用)
            String regex = "(.*[a-z].*)" + "(.*[A-Z].*)";
            if (!pwd.matches(regex)) {
                throw new RuntimeException("密碼格式驗證不符");
            }

            System.out.println("最終顯示密碼為:" + pwd);
        }
    }
}
