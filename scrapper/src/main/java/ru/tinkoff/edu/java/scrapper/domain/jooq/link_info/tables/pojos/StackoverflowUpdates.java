/*
 * This file is generated by jOOQ.
 */

package ru.tinkoff.edu.java.scrapper.domain.jooq.link_info.tables.pojos;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class StackoverflowUpdates implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Boolean isAnswered;
    private Integer answerCount;

    public StackoverflowUpdates() {
    }

    public StackoverflowUpdates(StackoverflowUpdates value) {
        this.id = value.id;
        this.isAnswered = value.isAnswered;
        this.answerCount = value.answerCount;
    }

    @ConstructorProperties({"id", "isAnswered", "answerCount"})
    public StackoverflowUpdates(
        @NotNull Long id,
        @Nullable Boolean isAnswered,
        @Nullable Integer answerCount
    ) {
        this.id = id;
        this.isAnswered = isAnswered;
        this.answerCount = answerCount;
    }

    /**
     * Getter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.ID</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.ID</code>.
     */
    public void setId(@NotNull Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.IS_ANSWERED</code>.
     */
    @Nullable
    public Boolean getIsAnswered() {
        return this.isAnswered;
    }

    /**
     * Setter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.IS_ANSWERED</code>.
     */
    public void setIsAnswered(@Nullable Boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    /**
     * Getter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.ANSWER_COUNT</code>.
     */
    @Nullable
    public Integer getAnswerCount() {
        return this.answerCount;
    }

    /**
     * Setter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.ANSWER_COUNT</code>.
     */
    public void setAnswerCount(@Nullable Integer answerCount) {
        this.answerCount = answerCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StackoverflowUpdates other = (StackoverflowUpdates) obj;
        if (this.id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!this.id.equals(other.id)) {
            return false;
        }
        if (this.isAnswered == null) {
            if (other.isAnswered != null) {
                return false;
            }
        } else if (!this.isAnswered.equals(other.isAnswered)) {
            return false;
        }
        if (this.answerCount == null) {
            if (other.answerCount != null) {
                return false;
            }
        } else if (!this.answerCount.equals(other.answerCount)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.isAnswered == null) ? 0 : this.isAnswered.hashCode());
        result = prime * result + ((this.answerCount == null) ? 0 : this.answerCount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StackoverflowUpdates (");

        sb.append(id);
        sb.append(", ").append(isAnswered);
        sb.append(", ").append(answerCount);

        sb.append(")");
        return sb.toString();
    }
}
