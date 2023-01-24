      // Calculator Script for car

        if ($('#slider11').length > 0 || $('#slider22').length > 0 || $('#slider33').length > 0) {
            
            $("#slider11").slider({
                value: 50 * 1000,
                range: 'max',
                min: 0,
                max: 5000 * 1000,
                step: 50000,
                change: function(event, ui) {
                    // var amtValue = commaNumber(ui.value * 1000);
                    // $('#amt').val(amtValue);
                    $('#amt').val(commaNumber(ui.value));
                    calc_emi();
                },
                slide: function(event, ui) {
                    // var amtValue = commaNumber(ui.value * 1000);
                    // $('#amt').val(amtValue);
                    $('#amt').val(commaNumber(ui.value));
                    calc_emi();
                }
            }).slider("pips", {
                rest: "label",
                // labels: data,
                step: 10,
                prefix: "",
                suffix: "",
            });
            $('#slider11 .ui-slider-pip-initial').removeClass('ui-slider-pip-initial');

            $("#slider22").slider({
                range: 'max',
                value: 8,
                min: 8,
                max: 30,
                step: 0.02,
                change: function(event, ui) {
                    $('#per').val(ui.value);
                    calc_emi();
                },
                slide: function(event, ui) {
                    $('#per').val(ui.value);
                    calc_emi();
                }
            }).slider("pips", {
                rest: "label",
                step: 100
            });
            $('#slider22 .ui-slider-pip-initial').removeClass('ui-slider-pip-initial');

            $("#slider33").slider({
                range: 'max',
                value: 6,
                min: 6,
                max: 84,
                step: 1,
                change: function(event, ui) {
                    $('#yr').val(ui.value * 1);
                    calc_emi();
                },
                slide: function(event, ui) {
                    $('#yr').val(ui.value * 1);
                    calc_emi();
                }
            }).slider("pips", {
                rest: "label",
                step: 6,
                suffix: ""
            });
            $('#slider33 .ui-slider-pip-initial').removeClass('ui-slider-pip-initial');


            calc_emi();
        }

        function commaNumber(val) {
            var x = val;
            x = x.toString();
            var lastThree = x.substring(x.length - 3);
            var otherNumbers = x.substring(0, x.length - 3);
            if (otherNumbers != '') lastThree = ',' + lastThree;
            var res = otherNumbers.replace(/\B(?=(\d{2})+(?!\d))/g, ",") + lastThree;
            return res;
        }

        function calc_emi() {
            var principalAmt = $('#amt').val();
            principalAmt = principalAmt.replace(/,/g, "");
            var loanInterest = $('#per').val();
            var totalYears = $('#yr').val();

            rateOfInterest = loanInterest / (12 * 100);
            var numerator = (principalAmt * rateOfInterest) * (Math.pow((1 + rateOfInterest), totalYears));
            var denominator = (Math.pow((1 + rateOfInterest), totalYears)) - 1;
            emiInt = Math.round(numerator / denominator);
            emi = numerator / denominator;
            totalInterest = Math.round(emi * totalYears) - principalAmt;
            console.log(totalInterest);
            totalPayment = Math.round(emi * totalYears);


            $('.emi_value').text(commaNumber(emiInt));
            $('.total_interest').text(commaNumber(totalInterest));
            $('.principal_amount').text(commaNumber(principalAmt));
            $('.interest_rate').text(loanInterest);
            $('.total_payment').text(commaNumber(totalPayment));
            monthstoYear(totalYears);
        }

        function monthstoYear(res) {
            var y = res;
            var years = (y / 12).toFixed(1);
            var totalyears = parseFloat(years);
            console.log(totalyears);
            $('.yearVal').html(totalyears);
            if (totalyears <= 1) {
                $('.yrtxt').html(' year');
            } else {
                $('.yrtxt').html(' years');
            }
            return totalyears;
        }


        $("input#amt").blur(function() {
            var valInput = $(this).val();
            valInput = valInput.replace(/,/g, "");
            var num = valInput;
            var minAmt = '50000';
            //  if(valInput < minAmt){
            //    alert("Amount Should be between 5 lac and 20 lac");
            //    return false;
            //  }
            $('#slider11').slider({
                value: num
            });
        });       
        

        //script changed on 18.11.2019 start
        $("input#per").blur(function() {
            var valInput = $(this).val();
            // var minAmt = 6;
            $('#slider22').slider({
                value: valInput
            });
        });        

        $("input#per").on('keypress',function(e) {
            if(e.which == 13) {
                var valInput = $(this).val();
                // var minAmt = 6;
                $('#slider22').slider({
                    value: valInput
                });
            }
        });

        $("input#yr").blur(function() {
            var valInput = $(this).val();
            // var minAmt = 6;
            $('#slider33').slider({
                value: valInput
            });
        });


        $("input#yr").on('keypress',function(e) {
            if(e.which == 13) {
                var valInput = $(this).val();
                // var minAmt = 6;
                $('#slider33').slider({
                    value: valInput
                });
            }
        });

        $("input#amt").on('keypress',function(e) {
            if(e.which == 13) {
                // alert('You pressed enter!');
                var valInput = $(this).val();
                valInput = valInput.replace(/,/g, "");
                var num = valInput;
                var minAmt = '1000';
                //  if(valInput < minAmt){
                //    alert("Amount Should be between 5 lac and 20 lac");
                //    return false;
                //  }
                $('#slider11').slider({
                    value: num
                });
            }
        });

        
        //script changed on 18.11.2019 end



        // document.ready Ends.    