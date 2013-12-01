module Sirius
  module Client
    module Win32
      module Classes
        module Controls
          class Button < Control
            def initialize(locator, parent = nil)
              super(locator, parent)
            end

            # SYNOPSIS
            #   getCheck(parameters)
            #
            # ARGS
            #   parameters      GetCheck - {http://controls.classes.win32.server.sirius.org/}getCheck
            #
            # RETURNS
            #   parameters      GetCheckResponse - {http://controls.classes.win32.server.sirius.org/}getCheckResponse
            #
            def get_check
              @client.core.button.getCheck(@locator.hwnd)
            end

            # SYNOPSIS
            #   isPushed(parameters)
            #
            # ARGS
            #   parameters      IsPushed - {http://controls.classes.win32.server.sirius.org/}isPushed
            #
            # RETURNS
            #   parameters      IsPushedResponse - {http://controls.classes.win32.server.sirius.org/}isPushedResponse
            #
            def pushed?
              @client.core.button.isPushed(@locator.hwnd)
            end

            # SYNOPSIS
            #   isChecked(parameters)
            #
            # ARGS
            #   parameters      IsChecked - {http://controls.classes.win32.server.sirius.org/}isChecked
            #
            # RETURNS
            #   parameters      IsCheckedResponse - {http://controls.classes.win32.server.sirius.org/}isCheckedResponse
            #
            def checked?
              @client.core.button.isChecked(@locator.hwnd)
            end

            # SYNOPSIS
            #   setCheck(parameters)
            #
            # ARGS
            #   parameters      SetCheck - {http://controls.classes.win32.server.sirius.org/}setCheck
            #
            # RETURNS
            #   parameters      SetCheckResponse - {http://controls.classes.win32.server.sirius.org/}setCheckResponse
            #
            def set_check(state)
              @client.core.button.setCheck(@locator.hwnd,state)
            end

            # SYNOPSIS
            #   isIntermediate(parameters)
            #
            # ARGS
            #   parameters      IsIntermediate - {http://controls.classes.win32.server.sirius.org/}isIntermediate
            #
            # RETURNS
            #   parameters      IsIntermediateResponse - {http://controls.classes.win32.server.sirius.org/}isIntermediateResponse
            #
            def intermediate?
              @client.core.button.isIntermediate(@locator.hwnd)
            end

            # SYNOPSIS
            #   getState(parameters)
            #
            # ARGS
            #   parameters      GetState - {http://controls.classes.win32.server.sirius.org/}getState
            #
            # RETURNS
            #   parameters      GetStateResponse - {http://controls.classes.win32.server.sirius.org/}getStateResponse
            #
            def get_state()
              @client.core.button.getState(@locator.hwnd)
            end

            # SYNOPSIS
            #   setState(parameters)
            #
            # ARGS
            #   parameters      SetState - {http://controls.classes.win32.server.sirius.org/}setState
            #
            # RETURNS
            #   parameters      SetStateResponse - {http://controls.classes.win32.server.sirius.org/}setStateResponse
            #
            def set_state()
              @client.core.button.setState(@locator.hwnd)
            end
          end
        end
      end
    end
  end
end