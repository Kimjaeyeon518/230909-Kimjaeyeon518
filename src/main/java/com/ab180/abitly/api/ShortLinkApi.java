package com.ab180.abitly.api;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShortLinkApi {

    /**
     * <p> 회원가입 </p>
     *
     * @param memberRegisterRequest {@link MemberRegisterRequest}
     * @return {@link ResponseCommonWrapper}
     */
    @PostMapping("/register")
    public ResponseEntity<> register(
        @Valid @RequestBody MemberRegisterRequest memberRegisterRequest
    ) {

        return null;
    }
}
