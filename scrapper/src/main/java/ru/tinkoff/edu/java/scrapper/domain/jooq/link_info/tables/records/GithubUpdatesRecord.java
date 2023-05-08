/*
 * This file is generated by jOOQ.
 */

package ru.tinkoff.edu.java.scrapper.domain.jooq.link_info.tables.records;

import java.beans.ConstructorProperties;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import ru.tinkoff.edu.java.scrapper.domain.jooq.link_info.tables.GithubUpdates;

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
public class GithubUpdatesRecord extends UpdatableRecordImpl<GithubUpdatesRecord>
    implements Record3<Long, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LINK_INFO.GITHUB_UPDATES.ID</code>.
     */
    public void setId(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>LINK_INFO.GITHUB_UPDATES.ID</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>LINK_INFO.GITHUB_UPDATES.FORKS_COUNT</code>.
     */
    public void setForksCount(@Nullable Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>LINK_INFO.GITHUB_UPDATES.FORKS_COUNT</code>.
     */
    @Nullable
    public Integer getForksCount() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>LINK_INFO.GITHUB_UPDATES.WATCHERS</code>.
     */
    public void setWatchers(@Nullable Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>LINK_INFO.GITHUB_UPDATES.WATCHERS</code>.
     */
    @Nullable
    public Integer getWatchers() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Long, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<Long, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return GithubUpdates.GITHUB_UPDATES.ID;
    }

    @Override
    @NotNull
    public Field<Integer> field2() {
        return GithubUpdates.GITHUB_UPDATES.FORKS_COUNT;
    }

    @Override
    @NotNull
    public Field<Integer> field3() {
        return GithubUpdates.GITHUB_UPDATES.WATCHERS;
    }

    @Override
    @NotNull
    public Long component1() {
        return getId();
    }

    @Override
    @Nullable
    public Integer component2() {
        return getForksCount();
    }

    @Override
    @Nullable
    public Integer component3() {
        return getWatchers();
    }

    @Override
    @NotNull
    public Long value1() {
        return getId();
    }

    @Override
    @Nullable
    public Integer value2() {
        return getForksCount();
    }

    @Override
    @Nullable
    public Integer value3() {
        return getWatchers();
    }

    @Override
    @NotNull
    public GithubUpdatesRecord value1(@NotNull Long value) {
        setId(value);
        return this;
    }

    @Override
    @NotNull
    public GithubUpdatesRecord value2(@Nullable Integer value) {
        setForksCount(value);
        return this;
    }

    @Override
    @NotNull
    public GithubUpdatesRecord value3(@Nullable Integer value) {
        setWatchers(value);
        return this;
    }

    @Override
    @NotNull
    public GithubUpdatesRecord values(@NotNull Long value1, @Nullable Integer value2, @Nullable Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GithubUpdatesRecord
     */
    public GithubUpdatesRecord() {
        super(GithubUpdates.GITHUB_UPDATES);
    }

    /**
     * Create a detached, initialised GithubUpdatesRecord
     */
    @ConstructorProperties({"id", "forksCount", "watchers"})
    public GithubUpdatesRecord(@NotNull Long id, @Nullable Integer forksCount, @Nullable Integer watchers) {
        super(GithubUpdates.GITHUB_UPDATES);

        setId(id);
        setForksCount(forksCount);
        setWatchers(watchers);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised GithubUpdatesRecord
     */
    public GithubUpdatesRecord(ru.tinkoff.edu.java.scrapper.domain.jooq.link_info.tables.pojos.GithubUpdates value) {
        super(GithubUpdates.GITHUB_UPDATES);

        if (value != null) {
            setId(value.getId());
            setForksCount(value.getForksCount());
            setWatchers(value.getWatchers());
            resetChangedOnNotNull();
        }
    }
}
