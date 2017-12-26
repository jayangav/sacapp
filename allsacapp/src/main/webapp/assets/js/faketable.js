$(function() {

	// var products = [
	//
	// [ '1', 'ABC' ],
	// [ '2', 'CCC' ],
	// [ '3', 'VVV' ],
	// [ '4', 'BBB' ],
	// [ '5', 'AAA' ],
	// [ '6', 'SSS' ],
	// [ '7', 'FFF' ],
	// [ '8', 'WER' ]
	//
	// ];

	var $table = $('#productListTable');
	if ($table.length) {

		// console.log('inside the table');

		var jsonUrl = '';

		if (window.product_id == '') {

			jsonUrl = window.contextRoot + '/json/data/all/products';

		}

		$table.DataTable({

			// data: products

			ajax: {

				url : jsonUrl,
				dataSrc : ''

			},

			columns: [

			
				{
					data:'product_name'
					
				},
				
				{
					data:'product_price'
					
				},
				
				{
					data:'id',
					mRender: function(data, type, row){
						
						var str = '';
						str += '<a href="'+window.contextRoot+'/show/'+data+'/product" class= "btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span> </a>';
						str += '<a href="'+window.contextRoot+'/cart/show/'+data+'/product" class= "btn btn-success"><span class= "glyphicon glyphicon-shopping-cart"></span></a>';
						return str;
					}
					
					
				}
				
				
				
				]

		});
	}

});