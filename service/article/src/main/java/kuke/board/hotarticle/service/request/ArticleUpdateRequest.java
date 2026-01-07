package kuke.board.hotarticle.service.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ArticleUpdateRequest {
    private String title;
    private String content;
}
