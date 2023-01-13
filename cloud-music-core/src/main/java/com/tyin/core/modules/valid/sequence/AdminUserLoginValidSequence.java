package com.tyin.core.modules.valid.sequence;

import jakarta.validation.GroupSequence;

/**
 * @author TyinZero
 * @date 2022/12/29
 * @description ...
 */
@GroupSequence({UsernameBankCheck.class, UsernameLengthCheck.class, PasswordBankCheck.class, PasswordLengthCheck.class})
public interface AdminUserLoginValidSequence {
}
