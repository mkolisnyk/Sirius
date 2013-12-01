module Sirius
  module Client
    module Win32
      module Classes
        module Controls
          class Spin < Control
            def initialize(locator, parent = nil)
              super(locator, parent)
            end

            # SYNOPSIS
            #   getLowerBound(parameters)
            #
            # ARGS
            #   parameters      GetLowerBound - {http://controls.classes.win32.server.sirius.org/}getLowerBound
            #
            # RETURNS
            #   parameters      GetLowerBoundResponse - {http://controls.classes.win32.server.sirius.org/}getLowerBoundResponse
            #
            def get_lower_bound
              @client.core.spin.getLowerBound(parameters)
            end

            # SYNOPSIS
            #   getUpperBound(parameters)
            #
            # ARGS
            #   parameters      GetUpperBound - {http://controls.classes.win32.server.sirius.org/}getUpperBound
            #
            # RETURNS
            #   parameters      GetUpperBoundResponse - {http://controls.classes.win32.server.sirius.org/}getUpperBoundResponse
            #
            def get_upper_bound
              @client.core.spin.getUpperBound(parameters)
            end

            # SYNOPSIS
            #   getSmallStep(parameters)
            #
            # ARGS
            #   parameters      GetSmallStep - {http://controls.classes.win32.server.sirius.org/}getSmallStep
            #
            # RETURNS
            #   parameters      GetSmallStepResponse - {http://controls.classes.win32.server.sirius.org/}getSmallStepResponse
            #
            def get_small_step
              @client.core.spin.getSmallStep(parameters)
            end

            # SYNOPSIS
            #   getLargeStep(parameters)
            #
            # ARGS
            #   parameters      GetLargeStep - {http://controls.classes.win32.server.sirius.org/}getLargeStep
            #
            # RETURNS
            #   parameters      GetLargeStepResponse - {http://controls.classes.win32.server.sirius.org/}getLargeStepResponse
            #
            def get_large_step
              @client.core.spin.getLargeStep(parameters)
            end

            # SYNOPSIS
            #   increment(parameters)
            #
            # ARGS
            #   parameters      Increment - {http://controls.classes.win32.server.sirius.org/}increment
            #
            # RETURNS
            #   parameters      IncrementResponse - {http://controls.classes.win32.server.sirius.org/}incrementResponse
            #
            def increment
              @client.core.spin.increment(parameters)
            end

            # SYNOPSIS
            #   getText(parameters)
            #
            # ARGS
            #   parameters      GetText - {http://controls.classes.win32.server.sirius.org/}getText
            #
            # RETURNS
            #   parameters      GetTextResponse - {http://controls.classes.win32.server.sirius.org/}getTextResponse
            #
            def get_text
              @client.core.spin.getText(parameters)
            end

            # SYNOPSIS
            #   setText(parameters)
            #
            # ARGS
            #   parameters      SetText - {http://controls.classes.win32.server.sirius.org/}setText
            #
            # RETURNS
            #   parameters      SetTextResponse - {http://controls.classes.win32.server.sirius.org/}setTextResponse
            #
            def set_text
              @client.core.spin.setText(parameters)
            end

            # SYNOPSIS
            #   decrement(parameters)
            #
            # ARGS
            #   parameters      Decrement - {http://controls.classes.win32.server.sirius.org/}decrement
            #
            # RETURNS
            #   parameters      DecrementResponse - {http://controls.classes.win32.server.sirius.org/}decrementResponse
            #
            def decrement
              @client.core.spin.decrement(parameters)
            end

            # SYNOPSIS
            #   getPosition(parameters)
            #
            # ARGS
            #   parameters      GetPosition - {http://controls.classes.win32.server.sirius.org/}getPosition
            #
            # RETURNS
            #   parameters      GetPositionResponse - {http://controls.classes.win32.server.sirius.org/}getPositionResponse
            #
            def get_position
              @client.core.spin.getPosition(parameters)
            end

            # SYNOPSIS
            #   setPosition(parameters)
            #
            # ARGS
            #   parameters      SetPosition - {http://controls.classes.win32.server.sirius.org/}setPosition
            #
            # RETURNS
            #   parameters      SetPositionResponse - {http://controls.classes.win32.server.sirius.org/}setPositionResponse
            #
            def set_position
              @client.core.spin.setPosition(parameters)
            end
          end
        end
      end
    end
  end
end