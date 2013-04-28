module Sirius
  module Client
    module Web
      module Classes
        class WebPopupList < WebControl
          def initialize(parent, locator, parentElement = nil)
            super(parent, locator, parent_element)
          end

          def multi?
            client.core.isMultiple(@parent_element, @locator)
          end

          def deselect_all
            client.core.deselectAll(@parent_element, @locator)
          end

          def deselect_by_index(index)
            client.core.deselectByIndex(@parent_element, @locator, index)
          end

          def  deselect_by_value(value)
            client.core.deselectByValue(@parent_element, @locator, value)
          end

          def deselect_by_visible_text(text)
            client.core.deselectByVisibleText(@parent_element, @locator, text)
          end

          def get_all_options
            client.core.getAllOptions(@parent_element, @locator)
          end

          def select_by_index(index)
            client.core.selectByIndex(@parent_element, @locator, index)
          end

          def select_by_value(value)
            client.core.selectByValue(@parent_element, @locator, value)
          end

          def select_by_visible_text(text)
            client.core.selectByVisibleText(@parent_element, @locator, text)
          end

          def get_all_selected_options
            client.core.getAllSelectedOptions(@parent_element, @locator)
          end

          def get_first_selected_option
            client.core.getFirstSelectedOption(@parent_element, @locator)
          end
        end
      end
    end
  end
end