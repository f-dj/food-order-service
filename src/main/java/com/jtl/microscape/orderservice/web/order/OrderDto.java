package com.jtl.microscape.orderservice.web.order;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@Builder
@Getter
@ToString
public class OrderDto {

    private final Long id;

    @NotNull
    private final Instant placedAt;

    @NotEmpty
    @Valid
    @Builder.Default
    private final List<OrderLineItemDto> orderLineItems = new ArrayList<>();

}
