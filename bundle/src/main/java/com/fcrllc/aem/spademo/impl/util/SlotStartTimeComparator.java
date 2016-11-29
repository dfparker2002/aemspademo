package com.fcrllc.aem.spademo.impl.util;

import com.fcrllc.aem.spademo.impl.domain.Slot;
import com.fcrllc.aem.spademo.impl.domain.SortDirection;

/**
 * Slot comparator by the starting slot time field.
 * 
 * @author David Parker (dfparker@gmail.com)
 * @author bojana.popovska
 */
public class SlotStartTimeComparator extends AbstractSlotComparator {

  /**
   * Constructor.
   * 
   * @param sortDirection {@link SortDirection}.
   */
  public SlotStartTimeComparator(SortDirection sortDirection) {
    super(sortDirection);
  }

  /**
   * Compare by the speakers field.
   * 
   * @param first {@link Slot}.
   * @param second {@link Slot}.
   * @return comparison result.
   */
  @Override
  public int compare(Slot first, Slot second) {
    switch (getSortDirection()) {
      case ASC:
        return first.getStartTime().compareTo(second.getStartTime());
      case DESC:
        return second.getStartTime().compareTo(first.getStartTime());
      default:
        throw new IllegalStateException("Unknown sorting direction");
    }
  }

}
