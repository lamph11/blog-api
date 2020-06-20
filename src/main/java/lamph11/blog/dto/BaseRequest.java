package lamph11.blog.dto;

import lombok.Data;

public interface BaseRequest<T> {

    T getBody();

    default Integer getPageSize() {
        return 0;
    }


    default Integer getPageNumber() {
        return 10;
    }

    default String getSortField() {
        return "id";
    }

    default String getSortDirection() {
        return "asc";
    }
}
