package com.fcrllc.aem.spademo.impl.util;

import com.fcrllc.aem.spademo.impl.domain.Slot;
import com.fcrllc.aem.spademo.impl.domain.SortDirection;

/**
 * Slot comparator by the Speakers field.
 * 
 * @author David Parker (dfparker@gmail.com)
 * @author bojana.popovska
 */
public class SlotSpeakersComparator extends AbstractSlotComparator {

  /**
   * Constructor.
   * 
   * @param sortDirection {@link SortDirection}.
   */
  public SlotSpeakersComparator(SortDirection sortDirection) {
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
        return first.getSpeakers().compareTo(second.getSpeakers());
      case DESC:
        return second.getSpeakers().compareTo(first.getSpeakers());
      default:
        throw new IllegalStateException("Unknown sorting direction");
    }
  }

}
