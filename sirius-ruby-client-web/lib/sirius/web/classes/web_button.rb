module Sirius
  module Client
    module Web
      module Classes
        class WebButton < WebControl
          attr_accessor :parent
          attr_accessor :parent_element
          attr_accessor :locator

          def initialize(parent, locator, parent_element = nil)
            @parent = parent
            @parent_element = parent_element
            @locator = locator
          end

          def text
            res = self.value
            res = self.inner_text if res == nil
            res
          end
        end
      end
    end
  end
end